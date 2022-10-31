package Practiceprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Deleting  
{
	public static void main(String[] args) 
	{
//		int empid;
//		Scanner sc=new Scanner(System.in);
		//empid=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" driver found");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
			Statement statement=connection.createStatement();
			String query ="delete from usha.student2 where empid=56";
			statement.executeUpdate(query);
			
			System.out.println("data deleted successfully");
		
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		}

}
