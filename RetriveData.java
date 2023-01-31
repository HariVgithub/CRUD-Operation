package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class RetriveData {
	static Scanner s =new Scanner(System.in);
	public static void retrivedata() throws Exception {
		System.out.println("What data you want Employee or Student");
		String data=s.next().toLowerCase();
		if(data.equals("employee")) {
			retriveEmpDetails();
		}
		else if(data.equals("student")) {
			retriveStdDetails();
		}
	}
	public static void retriveEmpDetails() throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
	Statement stmt=con.createStatement();
	System.out.println("Enter the Table name here :");
	String emptable=s.next();
	System.out.println("Enter Employee id here :");
	String id=s.next();
	String sQuery="select * from "+emptable+" where eid="+id+"";
	ResultSet rs=stmt.executeQuery(sQuery);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
	}
	if(con!=null) {
		con.close();
	}
	if(stmt!=null) {
		stmt.close();
	}
			}
	public static void retriveStdDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
		Statement stmt=con.createStatement();
		System.out.println("Enter the Table name here :");
		String stdtable=s.next();
		System.out.println("Enter Student id here :");
		String id=s.next();
		String sQuery="select * from "+stdtable+" where sid="+id+"";
		ResultSet rs=stmt.executeQuery(sQuery);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
		}
		
		if(con!=null) {
			con.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
				}
}
