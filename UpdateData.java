package com.connection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
   public static void updatedata() throws Exception {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Existing Table Name :");
	   String tablename=s.next();
	   System.out.println("Enter Column name :");
	   String colname=s.next();
	   System.out.println("Enter New value:");
	   String val=s.next();
	   System.out.println("Enter id column name :");
	   String idcol=s.next();
	   System.out.println("Enter Unique id :");
	   String id=s.next();
	   updateQuery(colname,val,id,idcol,tablename);
	   
   }
private static void updateQuery(String colname,String val,String id,String idcol,String tablename) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
  	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi");
  	 Statement stmt=con.createStatement();
  	 char num[]= {'0','1','2','3','4','5','6','7','8','9'};
  	 String uQuery="update "+tablename+" set "+colname+"='"+val+"' where "+idcol+"="+id+"";
  		 for(int j=0;j<num.length;j++) {
  			 if(val.charAt(0)==num[j]) {
  				 uQuery="update "+tablename+" set "+colname+" = "+val+" where "+idcol+"="+id+"";
  				 break;
  		 }
  	 }
  	 int nora=stmt.executeUpdate(uQuery);
  	 System.out.println(nora+" row is updated...");
  	if(con!=null)
		con.close();
	if(stmt!=null)
		stmt.close();
} 
}
