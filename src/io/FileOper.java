package io;

import java.io.*;
class FileOper
{
	public static void main(String str[])
	{
		try
		{
			
			File file=new File("C:\\Hello");
			file.mkdir();
			System.out.println("Is file a directory: " + file.isDirectory());
			File file1=new File(file,"myFile.txt");
			System.out.println("New file's absolute path: " + file1.getAbsolutePath());
			
			if(file1.exists())
			{
				file1.delete();
			}
			boolean b=file1.createNewFile();
			System.out.println("File created: " +b);
			System.out.println("Is file a directory: " +file1.isDirectory());
			System.out.println("Is file hidden: " + file1.isHidden());
			System.out.println("File's Parent " + file1.getParent());
			
			FileWriter writer=new FileWriter(file1);
			writer.write("Hello");
			
			writer.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
