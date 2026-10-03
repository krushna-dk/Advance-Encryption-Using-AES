/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectivity;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Encryption_decryption_infoDBOP 
{
     public String[][] getDecryptionInfoDataFromDB(String uname)
    {
        String data[][] = null;
        try{
            DBDriver dbd =new DBDriver();
            Statement st1 = dbd.statementCreated();
            Statement st2 = dbd.statementCreated();
            String query = "select * from decryption_info where username = '"+uname+"'";
            ResultSet rs1 = st1.executeQuery(query);
            ResultSet rs2 = st2.executeQuery(query);
            int row = 0;
            while(rs1.next())
                row++;
            data = new String[row][3];
            int i=0;
            int x = 2;
            while(rs2.next())
            {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = rs2.getString(x);
                     x++;
                }
               x = 2;
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getDecryptionInfoDataFromDB() in class Encryption_decryption_infoDBOP: "+e);
        }
        return data;
    }
    public String[][] getEncryptionInfoDataFromDB(String uname)
    {
        String data[][] = null;
        try{
            DBDriver dbd =new DBDriver();
            Statement st1 = dbd.statementCreated();
            Statement st2 = dbd.statementCreated();
            String query = "select * from encryption_info where username = '"+uname+"'";
            ResultSet rs1 = st1.executeQuery(query);
            ResultSet rs2 = st2.executeQuery(query);
            int row = 0;
            while(rs1.next())
                row++;
            data = new String[row][3];
            int i=0;
            int x = 2;
            while(rs2.next())
            {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = rs2.getString(x);
                     x++;
                }
               x = 2;
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getEncryptionInfoDataFromDB() in class Encryption_decryption_infoDBOP: "+e);
        }
        return data;
    }
    public  boolean isEncryptionInfoInserted(String username,String date_time,String enc_filename, String key)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
        String query = "insert into encryption_info values ('"+username+"', '"+date_time+"', '"+enc_filename+"',  '"+key+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isEncryptionInfoInserted() in Encryption_infoDBOP: "+ e);
            flag = false;
        }
        return flag;
    }
     public  boolean isDecryptionInfoInserted(String username,String date_time,String enc_filename, String key)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
        String query = "insert into decryption_info values ('"+username+"', '"+date_time+"', '"+enc_filename+"',  '"+key+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isDecryptionInfoInserted() in Encryption_decryption_infoDBOP: "+ e);
            flag = false;
        }
        return flag;
    }
}
