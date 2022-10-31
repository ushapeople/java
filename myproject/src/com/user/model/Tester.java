package com.user.model;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList=new ArrayList();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "root");
		Statement statement=con.createStatement();
			ResultSet set=((java.sql.Statement) statement).executeQuery("SELECT * FROM demo.employee;");
			
			int i=11;
			while(set.next())
			{
	
				Employee employee=new Employee(set.getInt(1),set.getString(2),set.getString(3), set.getInt(4));
				//Employee e=new Employee();
				//e.setId(set.getInt(1));
			   // e.setName(set.getString(2));
			    //e.setAdd(set.getString(3));
			   // e.setZip(set.getInt(4));
			   // i++;
				//System.out.println( set.getString(2));
				arrayList.add(employee);
			}
			for(Employee e1:arrayList)
			{
				System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getAdd()+" "+e1.getZip());
			}
			//System.out.println(employee.getname());
		}
		
		catch(Exception e) {
			e.getStackTrace();
			
		}
	}

}
