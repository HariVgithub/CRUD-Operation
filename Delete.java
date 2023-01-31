package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	public static void deletedata() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("What table data you want to delete Employee or Student:");
		String table=s.next().toLowerCase();
		if(table.equals("employee")) 
		{
		System.out.println("Enter Employee Table Name:");
		String tablename=s.next().toLowerCase();
		System.out.println("Enter Employee id");
		String id=s.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
	   	Statement stmt=con.createStatement();
	   	String dQuery="delete from "+tablename+" where eid="+id+"";
	   	int nora=stmt.executeUpdate(dQuery);
	   	System.out.println(nora+"row is deleted....");
	   	if(con!=null)
	   		con.close();
	   	if(stmt!=null)
	   		stmt.close();
		}
		else if(table.equals("student")) {
			System.out.println("Enter Student Table Name:");
			String tablename=s.next().toLowerCase();
			System.out.println("Enter Student id");
			String id=s.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
		   	Statement stmt=con.createStatement();
		   	String dQuery="delete from "+tablename+" where sid="+id+"";
		   	int nora=stmt.executeUpdate(dQuery);
		   	System.out.println(nora+" row is deleted....");
		   	if(con!=null)
		   		con.close();
		   	if(stmt!=null)
		   		stmt.close();
		}
   
	}
	
}
