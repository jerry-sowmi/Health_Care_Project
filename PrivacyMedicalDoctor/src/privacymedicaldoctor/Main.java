/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package privacymedicaldoctor;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try
        {                    			
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");                                    
                                                
            DoctorFrame df=new DoctorFrame();
            df.setTitle("Doctor");
            df.setVisible(true);
            df.setResizable(false);             
            
            DoctorReceiver dr=new DoctorReceiver(df);
            dr.start();
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}        
    }
}
