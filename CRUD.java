	package com.connection.jdbc;
	
	import java.util.Scanner;
	
	public class CRUD {
	
			public static void main(String[] args) throws Exception {
				Scanner s=new Scanner(System.in);
				System.out.println("Enter 1 for Employee Table Creation:\n"
						+ "Enter 2 for Student Table Creation:\n"
						+ "Enter 3 for Drop Existing Table:\n"
						+ "Enter 4 for Existing Table Insertion:\n"
						+ "Enter 5 for Existing Table Updation:\n"
						+ "Enter 6 for Delete Existing Records:\n"
						+ "Enter 7 for Retrive Data Form Existing Table:");
				int opt=s.nextInt();
				if(opt==1) {
					CreateTable.createEmpTable();
					System.out.println("Enter 1 for insert the data:\nEnter 2 for quit:");
					int condi=s.nextInt();
					if(condi==1) {
						InsertData.insertEmpData();
					}
					else if(condi==2) {
						System.exit(0);
					}
					
				}
				else if(opt==2) {
					CreateTable.createStdTable();
					System.out.println("Enter 1 for insert the data:\nEnter 2 for quit:");
					int condi=s.nextInt();
					if(condi==1) {
						InsertData.insertStdData();
					}
					else if(condi==2) {
						System.exit(0);
					}
					
				}
				else if(opt==3) {
					DropTable.droptable();
				}
				else if(opt==4) {
					System.out.println("Enter 1 for Employee Insertion:\nEnter 2 for Student Insertion:");
					int table=s.nextInt();
					if(table==1) {
						InsertData.insertEmpData();
					}
					else if(table==2) {
						InsertData.insertStdData();
					}
					else {
						System.out.println("Something worng");
					}
				}
				else if(opt==5){
						UpdateData.updatedata();
						System.out.println("You want to update one more data:yes or no");
						String res=s.next().toLowerCase();
						if(res.equals("yes")) {
							UpdateData.updatedata();
						}
					
					else {
						System.out.println("Something worng");
					}
				}
				else if(opt==6) {
					Delete.deletedata();
				}
				else if(opt==7) {
					RetriveData.retrivedata();
				}
				else {
					System.out.println("Try again later!!!..");
				}
				
			}
	
			
			
			
			
			
			
	}
