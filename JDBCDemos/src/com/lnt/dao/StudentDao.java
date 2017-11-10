package com.lnt.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lnt.entities.Student;

import oracle.net.aso.n;

public class StudentDao {
	
	Connection con;
	public StudentDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","password");
			System.out.println("Connection established!!!  :) ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Student findStudentById(int id)
	{
		Statement st=null;
		ResultSet rs=null;
		try {
			 st=con.createStatement();
			 rs=st.executeQuery("select * from student where studid ="+id);
			Student student=new Student();
			while(rs.next())
			{
				int sid=rs.getInt(1);
				student.setStudId(sid);
				student.setName(rs.getString(2));
				student.setDob(rs.getDate(3));
				student.setMarks(rs.getInt(4));
			}
	
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}
	public List<Student> getAllStudents()
	{
		Statement st=null;
		ResultSet rs=null;
		List<Student> students=new ArrayList<>();
		
		try {
			st=con.createStatement();
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				Student student=new Student();
				int sid=rs.getInt(1);
				student.setStudId(sid);
				student.setName(rs.getString(2));
				student.setDob(rs.getDate(3));
				student.setMarks(rs.getInt(4));
		
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public boolean insertStudent(Student student)
	{
		PreparedStatement pst=null;
		
		
		try {
			pst=con.prepareStatement("insert into student values(?,?,?,?)");
			pst.setInt(1,student.getStudId());
			pst.setString(2, student.getName());
			pst.setDate(3,new java.sql.Date(student.getDob().getTime()));
			pst.setInt(4,student.getMarks());
			int rowsUpdated=pst.executeUpdate();
			if(rowsUpdated>0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
