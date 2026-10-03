/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_file_security_system;

import GUI.LoginFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class Advance_file_security_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        LoginFrame lf = new LoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        lf.setSize(d);
        lf.setVisible(true);
    }
    
}
