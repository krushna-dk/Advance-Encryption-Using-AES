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
public class Decryption_Init {
    public boolean doDecryption(String filepath, String dec_filepath, String key)
    {
        boolean flag = false;
        
        
       try{
            String dfilepath=filepath;
        File file1 = new File(dfilepath);
       
        FileByteReader fbr1 = new FileByteReader();

        byte allbytes1[] = fbr1.readContentIntoByteArray(file1);
        byte decdata[]=new AESManager().decryptData(key, allbytes1);
        
        new ByteWriter().writeSegment(decdata, dec_filepath);
        
        
           
        flag = true;
       }
       catch(Exception e)
       {
           System.out.println("Exception at doDecryption in class Decryption_Init: "+e);
       }
        
        return flag;
    }
}
