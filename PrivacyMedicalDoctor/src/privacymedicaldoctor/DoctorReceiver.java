/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package privacymedicaldoctor;

import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elcot
 */
public class DoctorReceiver extends Thread{
    
    DoctorFrame df;
    
    DoctorReceiver(DoctorFrame f)
    {
        df=f;
    }
    
    public void run()
    {
        try
        {
            DatagramSocket ds=new DatagramSocket(4000);
            while(true)
            {                
                byte data[]=new byte[100000];
                DatagramPacket dp=new DatagramPacket(data,0,data.length);
                ds.receive(dp);
                String str=new String(dp.getData()).trim(); 
                System.out.println("Received: "+str);
                String req[]=str.split("#");
                if(req[0].equals("ConnectServer"))       
                {
                    DefaultTableModel dm=(DefaultTableModel)df.jTable1.getModel();
                    Vector v=new Vector();
                    v.add(req[1].trim());
                    dm.addRow(v);     
                    
                    String pubkey=df.jTextField1.getText().trim();
                    String msg="pubkey#"+pubkey.trim();
                    int pt=Integer.parseInt(req[1].trim())+5000;
                    packetTransmission(msg,pt);
                }
                if(req[0].equals("ConnectSensor"))       
                {
                    int size=32;
                    Random rnd = new Random();
                    BigInteger p = BigInteger.probablePrime(size/2,rnd);
                    BigInteger q = p.nextProbablePrime();
                    BigInteger n = p.multiply(q);
                    BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
                    BigInteger e = getCoprime(m);
                    BigInteger d = e.modInverse(m);           
            
                    String pubkey = e.toString() + "," + n.toString();
                    String privkey = d.toString() + "," + n.toString(); 
                    
                    DefaultTableModel dm=(DefaultTableModel)df.jTable2.getModel();
                    Vector v=new Vector();
                    v.add(req[1].trim());
                    v.add(privkey.trim());
                    dm.addRow(v);
                    
                    String msk="PublicKey#"+pubkey.trim();
                    int ptc=Integer.parseInt(req[1].trim())+6000;
                    packetTransmission(msk,ptc);
                    
                    for(int i=0;i<df.jTable1.getRowCount();i++)
                    {
                        String serverid=df.jTable1.getValueAt(i,0).toString().trim();
                        String msg="ConnectSensor#"+req[1].trim();
                        int pt=Integer.parseInt(serverid.trim())+5000;
                        packetTransmission(msg,pt);
                        
                        String msg1="ServerDetails#"+serverid.trim();
                        int pt1=Integer.parseInt(req[1].trim())+6000;
                        packetTransmission(msg1,pt1);
                    }
                }
                if(req[0].equals("DownloadResponse"))       
                {
                    DefaultTableModel dm=(DefaultTableModel)df.jTable3.getModel();
                    Vector v=new Vector();
                    v.add(req[1].trim());
                    v.add(req[2].trim());
                    v.add(req[3].trim());
                    v.add(req[4].trim());
                    v.add(req[5].trim());  
                    v.add("-");
                    dm.addRow(v);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void packetTransmission(String msg, int pt) {
        try
        {
            byte data1[]=msg.getBytes();
            DatagramSocket ds1=new DatagramSocket();
            DatagramPacket dp1=new DatagramPacket(data1,0,data1.length,InetAddress.getByName("127.0.0.1"),pt);
            ds1.send(dp1);
            System.out.println("Port is "+pt+"\n");                        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }    
    }

    public static BigInteger getCoprime(BigInteger m) {
        Random rnd = new Random();
        int length = m.bitLength()-1;
        BigInteger e = BigInteger.probablePrime(length,rnd);
        while (! (m.gcd(e)).equals(BigInteger.ONE) ) {
      	 e = BigInteger.probablePrime(length,rnd);
        }
        return e;
    }
}
