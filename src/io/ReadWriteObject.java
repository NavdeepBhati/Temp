package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

	public void writeMyObject(Employee employee)
	{
		
		try {
              ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream
        (new File("object.txt")));
			oo.writeObject(employee);
			System.out.println("Object written to file");
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readMyObject()
	{
		try {
            ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("object.txt")));
			Employee savedEmployee=(Employee) oi.readObject();
			System.out.println(savedEmployee.toString());
			oi.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		ReadWriteObject rWriteObject=new ReadWriteObject();
                Employee employee=new Employee("deepika", 34, "deepika@gmail.com");
		//rWriteObject.writeMyObject(employee);
		rWriteObject.readMyObject();

	}

}
