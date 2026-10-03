/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author welcome
 */
public class ByteWriter
{
public boolean writeSegment(byte[] bytestoWrite,String path)
    {
boolean flag=false;
try
{
    byte b[] =new byte[bytestoWrite.length];
        
        int j=0;
        for(int i=0;i<bytestoWrite.length;i++)
        {
         b[j++]=bytestoWrite[i];

        }
       
  
   
//        byte encbyte[]=new XorOperation().getXORData(bytestoWrite);
        File ff=new File(path);
       FileOutputStream fop = new FileOutputStream(ff);
       fop.write(b);
       fop.flush();
	fop.close();

        flag=true;
  }
catch(Exception ex)
{
    System.out.println("Exception "+ex);
}
return flag;
    }
}
