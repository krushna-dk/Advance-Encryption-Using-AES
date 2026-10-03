/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class FileByteReader
{


     public  byte[] readContentIntoByteArray(File file)
   {
      FileInputStream fileInputStream = null;
      byte[] bFile = new byte[(int) file.length()];
      try
      {
         //convert file into array of bytes
         fileInputStream = new FileInputStream(file);
         fileInputStream.read(bFile);
         fileInputStream.close();
         for (int i = 0; i < bFile.length; i++)
         {
//            System.out.print((char) bFile[i]);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return bFile;
   }
}
