/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectivity;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class UserDBOP {
    public  boolean isdataIsUpdatedInDB(String name,String mobileno,String email, String username, String password)
    {
        boolean flag = false;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
        //name, dob, username, mobileno, email, password, date_time
        String query = "update user_info set name = '"+name+"',mobile_no = '"+mobileno+"',email= '"+email+"',password = '"+password+"' where username = '"+username+"' ";
        if(st.executeUpdate(query) > 0)
         flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isUpdated() in EmployeeOP: "+ e);
            flag = false;
        }
        return flag;  
    }
    public  boolean isUserDataInserted(String name,String mobileno,String email, String username, String password)
    {
        boolean flag = true;
        try{
        DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
        String query = "insert into user_info values ('"+name+"', '"+mobileno+"', '"+email+"',  '"+username+"', '"+password+"')";
        if(st.executeUpdate(query) > 0)
            flag = true;
         }
        catch(Exception e)
        {
            System.out.println("Exception at isUserDataInserted() in UserDBOP: "+ e);
            flag = false;
        }
        return flag;
    }
    
    public static boolean isUserExisted(String uname, String pass)
    {
        boolean flag = false;
        try
        {
          DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from user_info where username = '"+uname+"' and password = '"+pass+"' ";
          ResultSet rs = st.executeQuery(query);
          if(rs.next())
              flag = true;
        }
        catch(Exception e)
        {
            System.out.println("Exception at isUserExisted() in UserDBOP class: "+ e);
            flag = false;
        }
        return flag;
    }
    
    public static ArrayList getUserDataFromDB(String uname)
    {
        ArrayList temp = new ArrayList();
     try
        {
            DBDriver dbd =new DBDriver();
          Statement st = dbd.statementCreated();
          String query = "select * from user_info where username = '"+uname+"'";
          ResultSet rs = st.executeQuery(query);
          while(rs.next())
          {
              //name, mobileno, email, username, password
              temp.add(rs.getString(1));
              temp.add(rs.getString(2));
              temp.add(rs.getString(3));
              temp.add(rs.getString(4));
              temp.add(rs.getString(5));
             
          }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getUserDataFromDB() in UserDBOP class: "+ e); 
        }   
     return temp;
    }
   
    
}
