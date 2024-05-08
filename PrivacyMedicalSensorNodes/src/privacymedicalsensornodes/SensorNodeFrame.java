/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package privacymedicalsensornodes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.SignatureException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elcot
 */
public class SensorNodeFrame extends javax.swing.JFrame {

    /**
     * Creates new form SensorNodeFrame
     */
    int snid;
    ArrayList path=new ArrayList();
    String inputfile;
    
    public SensorNodeFrame(int id) {
        initComponents();
        snid=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sensor Node");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Paillier Public Key");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(259, 259, 259))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jTabbedPane1.addTab("Connect", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Server Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Server Details", jPanel3);

        jLabel4.setText("Enter the Filename:");

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton4.setText("Encrypt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Upload");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Split");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Encrypt & Upload", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String msg="ConnectSensor#"+snid;
        int pt=4000;
        packetTransmission(msg,pt);
        JOptionPane.showMessageDialog(this,"Connected Successfully!");
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            JFileChooser fc=new JFileChooser();
            int result=fc.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) 
            {
                File file=fc.getSelectedFile();				
                jTextField3.setText(file.getName());  
                inputfile=file.getAbsolutePath().trim();
                
                String fname=file.getAbsolutePath();
                File fe=new File(fname);                 
                FileInputStream fis=new FileInputStream(fe);
                byte data[]=new byte[fis.available()];
                fis.read(data);
                fis.close();
                String str=new String(data);
		jTextArea1.setText(str.trim().replaceAll("#",""));                
            }
            else if (result == JFileChooser.CANCEL_OPTION) 
            {
                JOptionPane.showMessageDialog(this,"Open Command cancelled by user.");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try
        {  		
            
            int nof=jTable1.getRowCount();
            File file = new File(inputfile);  
            Scanner scanner = new Scanner(file);  
            int count = 0;            
            String filname=file.getName();
            String fi=filname.substring(0,filname.lastIndexOf('.'));
            while (scanner.hasNextLine())   
            {  
                scanner.nextLine();  
                count++;  
            }  
            System.out.println("Lines in the file: " + count);     // Displays no. of lines in the input file.  
            
            if(nof<=count)
            {
                double temp = (count/nof);
                double nol=temp+1;
                System.out.println("No. of lines to be generated for each file:"+nol); // Displays no. of files to be generated.  
            
            //---------------------------------------------------------------------------------------------------------  
      
			// Actual splitting of file into smaller files  
      
                FileInputStream fstream = new FileInputStream(inputfile);
                DataInputStream in = new DataInputStream(fstream);  
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine="";  
                
                for (int j=1;j<=nof;j++)  
                {  
                    if(j==nof)
                    {
                        nol=(count-nol*nof)+nol;
                        System.out.println("Last "+nol);
                    }
                    FileWriter fstream1 = new FileWriter("FILE/"+fi+""+j+".txt");     // Destination File Location  
                    if(!(path.contains("FILE/"+fi+""+j+".txt")))
                    {
                        path.add("FILE/"+fi+""+j+".txt");
                    }
                    BufferedWriter out = new BufferedWriter(fstream1);   
                    for (int i=1;i<=nol;i++)  
                    {  
                        strLine = br.readLine();   
                        if (strLine!= null)  
                        {  
                            out.write(strLine);
                            if(i!=nol)  
                            {  
                                out.newLine();  
                            }  
                        }  
                    }  
                    out.close();
                }  
                in.close(); 
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No of Lines in the file "+count+" So don't ask for too much!");
            }
            System.out.println("paths: "+path);
            
            String ablck="";
            for(int p=0;p<path.size();p++)
            {
                String p1=path.get(p).toString();
		String fname=p1;
		File fe=new File(fname);
		FileInputStream fis=new FileInputStream(fe);
		byte data[]=new byte[fis.available()];
		fis.read(data);
		fis.close();
		String str1=new String(data);                
                ablck=ablck+"\n=======================\nBlock - "+(p+1)+"\n=======================\n"+str1.trim()+"\n";
            }
            JOptionPane.showMessageDialog(this,"Splitted Successfully!");
            jTextArea1.setText(ablck.trim());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String publickey=jTextField1.getText().trim();
        
        String[] s5 = publickey.split(",");
        String e = s5[0];
        String n = s5[1];                                    
                
        try
        {
            String ablck="";            
            for(int p=0;p<path.size();p++)
            {
                String p1=path.get(p).toString();		
		File fe=new File(p1.trim());
                String fname=fe.getName();
		FileInputStream fis=new FileInputStream(fe);
		byte data[]=new byte[fis.available()];
		fis.read(data);
		fis.close();
		String str1=new String(data);
                
                String ce = "";
                char ch[]=str1.trim().toCharArray();
                for(int i=0;i<ch.length;i++)
                {
                    char c=ch[i];                    
                    System.out.println((int)c);                    
                    BigInteger orig = BigInteger.valueOf((int)c);
                    String ci = orig.modPow(new BigInteger(e), new BigInteger(n)).toString();
                    ce = ce + ci + ",";
                }
                String cipfile = ce.substring(0, ce.lastIndexOf(','));
                
                Signature sg=new Signature();
		String sign=sg.calculateRFC2104HMAC(cipfile.trim(),fname.trim());
                System.out.println("cipfile: "+cipfile.trim());
                System.out.println("fname: "+fname.trim());
                System.out.println("sign: "+sign.trim());
                
                ablck=ablck+"\n=======================\nBlock - "+(p+1)+"\n=======================\n"+cipfile.trim()+"\nSignature: "+sign.trim()+"\n";
            }
            JOptionPane.showMessageDialog(this,"Encrypted & Signature Generated Successfully!");
            jTextArea1.setText(ablck.trim());
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String filename=jTextField3.getText().trim();                               
        
        String publickey=jTextField1.getText().trim();        
        String[] s5 = publickey.split(",");
        String e = s5[0];
        String n = s5[1];                                    
                
        try
        {                     
            for(int p=0;p<path.size();p++)
            {
                String p1=path.get(p).toString();		
		File fe=new File(p1.trim());
                String fname=fe.getName().trim();
		FileInputStream fis=new FileInputStream(fe);
		byte data[]=new byte[fis.available()];
		fis.read(data);
		fis.close();
		String str1=new String(data);
                
                String ce = "";
                char ch[]=str1.trim().toCharArray();
                for(int i=0;i<ch.length;i++)
                {
                    char c=ch[i];                    
                    System.out.println((int)c);                    
                    BigInteger orig = BigInteger.valueOf((int)c);
                    String ci = orig.modPow(new BigInteger(e), new BigInteger(n)).toString();
                    ce = ce + ci + ",";
                }
                String cipfile = ce.substring(0, ce.lastIndexOf(','));
                
                Signature sg=new Signature();
		String sign=sg.calculateRFC2104HMAC(cipfile.trim(),fname.trim());
                System.out.println("cipfile: "+cipfile.trim());
                System.out.println("fname: "+fname.trim());
                System.out.println("sign: "+sign.trim());
                
                try
                {                                                                               
                    String msg="Upload#"+snid+"#"+fname.trim()+"#"+cipfile.trim()+"#"+filename.trim()+"#"+sign.trim();
                    String sid=jTable1.getValueAt(p,0).toString().trim();
                    int pt=Integer.parseInt(sid.trim())+5000;
                    packetTransmission(msg,pt);
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }                                                                
            }
            JOptionPane.showMessageDialog(this,"Uploaded Successfully!");                        
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");;
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SensorNodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorNodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorNodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorNodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SensorNodeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

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

    

    public static class Signature 
    {
	private static final String HMAC_ALGORITHM = "HmacSHA1";
	
	public static String calculateRFC2104HMAC(String data, String key) throws java.security.SignatureException
	{
            String result;
            try 
            {		
		SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_ALGORITHM);
		
		Mac mac = Mac.getInstance(HMAC_ALGORITHM);
		mac.init(signingKey);
		
		byte[] rawHmac = mac.doFinal(data.getBytes());
				
		result = new String(encode(rawHmac));
            }
            catch (Exception e) 
            {
                throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
            }
            return result;
        }	
	
        private static char[] encode(byte[] bytes) 
        {
            final int amount = bytes.length;
            char[] result = new char[2 * amount];
            
            int j = 0;
            for (int i = 0; i < amount; i++) 
            {
                result[j++] = HEX[(0xF0 & bytes[i]) >>> 4];
                result[j++] = HEX[(0x0F & bytes[i])];
            }

            return result;
        }

        private static final char[] HEX = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
    }
}
