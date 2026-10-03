/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectivity;

import java.sql.*;
/**
 *
 * @author User
 */
public class DBDriver {
    public Connection conn = null;
    public Statement st=null;
    public  Statement statementCreated()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_file_security_system", "root", "1234");
            st = conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Exception at statementCreated() in class DBDriver: "+ e);  
        }
      return st;
    }
    public Connection connectionCreated() {
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankingsystem","root","1234"
        );
    } catch (Exception e) {
        System.out.println("Exception at connectionCreated() in class DBDriver: " + e);
    }
    return conn;
}

}
