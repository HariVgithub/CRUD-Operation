package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class CreateTable {
     public static void createEmpTable() throws Exception{
    	 Scanner s=new Scanner(System.in);
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
    	 Statement stmt=con.createStatement();
    	 System.out.println("Enter Table Name : ");
    	 String tablename=s.next().toLowerCase();
    	 System.out.println("Enter id Column Name:");
    	 String idcol=s.next().toLowerCase();
    	 System.out.println("Enter Name Column Name :");
    	 String namecol=s.next().toLowerCase();
    	 System.out.println("Enter Salary Column Name :");
    	 String salcol=s.next();
    	 System.out.println("Enter Designation Column Name :");
    	 String descol=s.next().toLowerCase();
    	 System.out.println("Enter Department no Column Name : ");
    	 String deptnocol=s.next();
    		 String cQuery="CREATE TABLE `mydatabase`.`"+tablename+"` (\r\n"
    		 		+ "  `"+idcol+"` INT NOT NULL,\r\n"
    		 		+ "  `"+namecol+"` VARCHAR(45) NOT NULL,\r\n"
    		 		+ "  `"+salcol+"` DOUBLE NOT NULL,\r\n"
    		 		+ "  `"+descol+"` VARCHAR(45) NOT NULL,\r\n"
    		 		+ "  `"+deptnocol+"` INT NULL,\r\n"
    		 		+ "  PRIMARY KEY (`"+idcol+"`));\r\n"
    		 		+ "";
        	 stmt.execute(cQuery); 
        	 System.out.println(tablename);
        	 System.out.println(idcol+"\t"+namecol+"\t"+salcol+"\t"+descol+"\t"+deptnocol);
        	 System.out.println(tablename +" is created successfully....");
        	 if(con!=null) {
        		 con.close();
        	 }
        	 if(stmt!=null) {
        		 stmt.close();
        	 }
        	
     }	
     public static void createStdTable() throws Exception{
    	 Scanner s=new Scanner(System.in);
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
    	 Statement stmt=con.createStatement();
    	 System.out.println("Enter Table Name : ");
    	 String tablename=s.next().toLowerCase();
    	 System.out.println("Enter id Column Name:");
    	 String idcol=s.next();
    	 System.out.println("Enter Name Column Name :");
    	 String namecol=s.next().toLowerCase();
    	 System.out.println("Enter Mark Column Name :");
    	 String markcol=s.next();
    	 System.out.println("Enter year Column Name :");
    	 String yearcol=s.next().toLowerCase();
    	 System.out.println("Enter Department Column Name : ");
    	 String deptcol=s.next();
    		 String cQuery="CREATE TABLE `mydatabase`.`"+tablename+"` (\r\n"
    		 		+ "  `"+idcol+"` INT NOT NULL,\r\n"
    		 		+ "  `"+namecol+"` VARCHAR(45) NOT NULL,\r\n"
    		 		+ "  `"+markcol+"` DOUBLE NOT NULL,\r\n"
    		 		+ "  `"+yearcol+"` INT NULL,\r\n"
    		 		+ "  `"+deptcol+"` VARCHAR(45) NOT NULL,\r\n"
    		 		+ "  PRIMARY KEY (`"+idcol+"`));\r\n"
    		 		+ "";
        	 stmt.execute(cQuery); 
        	 System.out.println(tablename);
        	 System.out.println(idcol+"\t"+namecol+"\t"+markcol+"\t"+yearcol+"\t"+deptcol);
        	 System.out.println(tablename +" is created successfully....");
        	 if(con!=null) {
        		 con.close();
        	 }
        	 if(stmt!=null) {
        		 stmt.close();
        	 }
        	 
     }
}
