/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

import java.io.File;

/**
 *
 * @author User
 */
public class Encryption_Init {
    public boolean doEncryption(String filepath, String encrypted_filepath_path, String key)
    {
        boolean flag = false;
        
        
       try{
        File file = new File(filepath);
       
        FileByteReader fbr = new FileByteReader();

        byte allbytes[] = fbr.readContentIntoByteArray(file);
        byte endata[]=new AESManager().encryptData(key, allbytes);
        
        new ByteWriter().writeSegment(endata, encrypted_filepath_path);
        flag = true;
       }
       catch(Exception e)
       {
           System.out.println("Exception at doEncryption in class Encryption_Init: "+e);
       }
        
        return flag;
    }
}
