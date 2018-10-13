package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Studentinfodb {
	
	public static void main(String[] args) {
		
		 Studentinfo s = new Studentinfo();
		 s.setId(2);
		 s.setName("Apoorv");
		 s.setRollno(250);
		 s.setCollage("test");
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sakila","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			String query = " insert into users (id, name, rollno, collage)"
			        + " values (?, ?, ?, ?, ?)";		
		      java.sql.PreparedStatement ps = con.prepareStatement(query);

			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));  
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
				}  
				}  
	
	


