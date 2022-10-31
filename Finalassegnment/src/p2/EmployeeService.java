package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import p1.Connectionfactory;

public class EmployeeService  implements EmployeeDao{
		
		 	
public static void main(String args[])
{
	Controller c=new Controller();
	c.operations();
//	c.Display();
//	c.Insert();
//	c.delete();
	
}
@Override
public void Display() 
{
	try
    {
		
		Connection con = Connectionfactory.getConnection();
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM usha.employee1");
		System.out.println("id\tname\tsalary");
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));

		}
    }
	
    catch(Exception e)
    {
        System.out.println(e);
    }
	
}

@Override
public void delete(Employee employee) 
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(" driver found");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
		Statement statement=connection.createStatement();
		Employee service employeeservice;
		String query ="delete from usha.employee1 where ("id=emp.getId")";
		statement.executeUpdate(query);
		
		System.out.println("data deleted successfully");
	
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
}

@Override
public void update() 
{
	(update employee1 set name='"+employee.getUsername()+"'  where id ='"+employee.getId()+"');
}

@Override
public void Insert(Employee employee) {
	 try
     {
Connection con = Connectionfactory.getConnection();
Statement stmt= con.createStatement();
Employee emp=new Employee();
stmt.executeUpdate("insert into usha."+ "employee1(`id`,`name`,`salary`) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"'))");
             
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
	
		}
	        
}



