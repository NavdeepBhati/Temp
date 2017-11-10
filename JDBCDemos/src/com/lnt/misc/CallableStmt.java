package com.lnt.misc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmt {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","password");
			
			CallableStatement cStatement=connection.prepareCall("{call addition(?,?,?)}");
			cStatement.registerOutParameter(3, Types.INTEGER);
			cStatement.setInt(1, 15);
			cStatement.setInt(2, 20);
			cStatement.execute();
			System.out.println(cStatement.getInt(3));
			cStatement.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
