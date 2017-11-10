package com.lnt.misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) {
	try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","password");
			System.out.println("Hurray!! Connection done.");
			
			Statement st=
					con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=
					st.executeQuery("select employee_id,first_name,last_name from employees");
		
			//Code for ResultSetMetaData starts
			ResultSetMetaData rsmd=rs.getMetaData();
			int colCount=rsmd.getColumnCount();
			for(int i=1;i<=colCount;i++)
			{
				System.out.print(rsmd.getColumnName(i) + "  ");
			}
			System.out.println();
			System.out.println("_____________________________________________________");
			
			
			System.out.println("________________________Traversing the resultset________________________________");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			}
			System.out.println("____________________________Traversing the resultset in reverse________________________________");
			while(rs.previous())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			}
			System.out.println("____________________________Moving to the last record____________________________");
			rs.last();
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			
			System.out.println("_________________________Moving to the first record____________________________");
			rs.first();
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			System.out.println("______________________________Moving to the 5 record____________________________");
			rs.absolute(5);
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			
			   rs.updateString("first_name", "Vijay");
			   rs.updateRow();
			   
			rs.next();
			rs.previous();
			System.out.println("The updated row");
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
