package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DropTable {
	public static void droptable() throws Exception {
		Scanner s=new Scanner(System.in);
   	 Class.forName("com.mysql.cj.jdbc.Driver");
   	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
   	 Statement stmt=con.createStatement();
   	 System.out.println("Enter the table name you want to drop:");
   	 String tablename=s.next();
   	 String dQuery="DROP TABLE `mydatabase`.`"+tablename+"`;";
   	 stmt.execute(dQuery);
   	 System.out.println(tablename+" is successfully droped...");
   	if(con!=null)
		con.close();
	if(stmt!=null)
		stmt.close();
	
	}
}
