package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            File file= new File("ReadFile.txt");
            FileWriter fw=new FileWriter(file);
            System.out.println("Please enter a string to write");
            String s=br.readLine();
            fw.write(s);
            fw.flush();
            fw.close();
            System.out.println("String written to file");
           int length=(int)file.length();
            FileReader fr=new FileReader(file);
            char buff[]=new char[length];
            System.out.println("Reading string back from file");
           while(fr.read(buff)!=-1)
            {
                System.out.println(buff);
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        
    }
}
