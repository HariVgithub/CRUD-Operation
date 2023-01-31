package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    
	public static void insertEmpData() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Existing Table Name here :");
		String tablename=s.next();
		System.out.println("How many Employee you want to add:");
		int count=s.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println("Enter the "+i+" Employee ID :");
			int id=s.nextInt();
			System.out.println("Enter the "+i+" Employee Name :");
			String name=s.next();
			System.out.println("Enter the "+i+" Employee Salary :");
			double sal=s.nextDouble();
			System.out.println("Enter Designation :");
			String des=s.next();
			System.out.println("Enter Department No : ");
			int deptno=s.nextInt();
			insertEmpQuery(id,name,sal,des,deptno,tablename);
			
		}
		
	}
	public static void insertStdData() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Existing Table Name here :");
		String tablename=s.next();
		System.out.println("How many Student you want to add:");
		int count=s.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println("Enter the "+i+" Student ID :");
			int id=s.nextInt();
			System.out.println("Enter the "+i+" Student Name :");
			String name=s.next();
			System.out.println("Enter the "+i+" Student Mark :");
			double mark=s.nextDouble();
			System.out.println("Enter year :");
			int year=s.nextInt();
			System.out.println("Enter Department Name : ");
			String dept=s.next();
			insertStdQuery(id,name,mark,year,dept,tablename);
			
		}
		
	}
	private static void insertEmpQuery(int id, String name, double sal, String des, int deptno,String tablename) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
		Statement stmt=con.createStatement();
		String iQuery="insert into "+tablename+" values("+id+",'"+name+"',"+sal+",'"+des+"',"+deptno+")";
		int nora=stmt.executeUpdate(iQuery);
		if(nora==1)
		System.out.println(nora+" rows is inserted...");
		else
			System.out.println("please try again...");
		if(con!=null)
			con.close();
		if(stmt!=null)
			stmt.close();
	}

	private static void insertStdQuery(int id, String name, double mark, int year, String dept,String tablename) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
		Statement stmt=con.createStatement();
		String iQuery="insert into "+tablename+" values("+id+",'"+name+"',"+mark+",'"+year+"','"+dept+"')";
		int nora=stmt.executeUpdate(iQuery);
		if(nora==1)
		System.out.println(nora+" rows is inserted...");
		else
			System.out.println("please try again...");
		if(con!=null)
			con.close();
		if(stmt!=null)
			stmt.close();
	}
	
}
