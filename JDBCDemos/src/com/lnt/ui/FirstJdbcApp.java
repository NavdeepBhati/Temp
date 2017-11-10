package com.lnt.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

import com.lnt.dao.StudentDao;
import com.lnt.entities.Student;

public class FirstJdbcApp {
	public static void main(String[] args) throws ParseException {
		Scanner scanner=new Scanner(System.in);
//		int id=scanner.nextInt();
		StudentDao dao=new StudentDao();
//		Student s=dao.findStudentById(id);
//		System.out.println(s);
//		
//		System.out.println("Printing all students");
//		List<Student> stList=dao.getAllStudents();
//		for(Student s1:stList)
//			System.out.println(s1);
//		
		
		System.out.println("Entr Student Id:");
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter DOB");
		String dt=scanner.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dob=sdf.parse(dt);
		System.out.println("Enter marks:");
		int marks=scanner.nextInt();
		
		Student student=new Student(id, name, dob, marks);
		boolean result=dao.insertStudent(student);
		if(result)
			System.out.println("Data inserted");
		else
			System.out.println("Error in insertion");
		
		
		
		
	}

}
