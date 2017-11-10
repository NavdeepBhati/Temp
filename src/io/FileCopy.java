package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args)  {
        try(FileInputStream fis=new FileInputStream("C:\\deepika\\ganesha.jpg");
                FileOutputStream fos=new FileOutputStream("c:\\movie\\ganesh.jpg");) 
        {
            int c=0;
            while((c=fis.read())!=-1){
                fos.write(c);
            }
            //fis.close();
            //fos.close();
            System.out.println("File copied");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
