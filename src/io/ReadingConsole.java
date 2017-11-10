package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingConsole {

	
	public static void main(String[] args) {
		
		
		try(BufferedReader  brBufferedReader=new BufferedReader(new InputStreamReader(System.in))) 
		{
            
            System.out.println("Enter the first number");
            int num1=Integer.parseInt(brBufferedReader.readLine());
            System.out.println("Enter the second number");
            int num2=Integer.parseInt(brBufferedReader.readLine());
            int addition =num1+num2;
                System.out.println("Addition:" + addition);
            //brBufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
