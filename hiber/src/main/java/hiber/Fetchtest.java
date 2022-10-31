package hiber;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Fetchtest {
	public static void selection()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("select\n1.insert\n2.delete\n3.update\n4.select");
		System.out.println("select the query");
		int s=sc.nextInt();
		if(s==1)
		{
			insert();
		}
	 else if(s==2)
		{
			delete();
		}
		else if(s==3)
		{
			update();
		}
		else if(s==4)
		{
			select();
	    }
		else 
		{
			System.out.println("invalid selection");
		}
		}
	public  static void insert()
	{
		Configuration configuration=new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		System.out.println("working");
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session session=factory.openSession();
		// Transaction tx=session.beginTransaction();
		 Transaction tx;
		String choice="no";
		 Scanner sc=new Scanner(System.in);
		do {
		 tx=session.beginTransaction();
			 Employee employee=new Employee();
			 System.out.println("enter employee id");
			 employee.setId(sc.nextInt());
			 System.out.println("enter the name");
			 employee.setName(sc.next());
			 System.out.println("enter the Annual salary");
			 employee.setSalary(sc.nextInt());
			 session.save(employee);
			 session.flush();
			 tx.commit();
			 System.out.println("one record inserted");
			 System.out.println("do you want one more record y/n");
			choice=sc.next();

			}
		while(choice.equalsIgnoreCase("y")|choice.equalsIgnoreCase("yes"));
				session.close();
			con();
			}
	public static void delete()
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("working");
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enetr employee id to delete");
		 Employee employee=(Employee)session.load(Employee.class,sc.nextInt());
		// if(employee!=null)
		// {
			 session.delete(employee);
			 tx.commit();
			 System.out.println("====one recor deleted====");
			 con();
			 
		// }
		// else
		// {
		//	 System.out.println("enter correct employee id");
		// }
	}
	public  static void update()
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("working");
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enetr employee id to update");
		 Employee employee=(Employee)session.load(Employee.class,sc.nextInt());
		 
		 if(employee!=null) {
		 System.out.println("enetr emp salary to update:");
		 employee.setSalary(sc.nextInt());
		 session.update(employee);
	     tx.commit();
	     
	     System.out.println("====one record updated====");
	     con();
	    }
		 else {
			 System.out.println("enter correct employee id:");
		 }
	}
	public static void select() {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("working");
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enetr employee id");
		 Employee employee=(Employee)session.load(Employee.class,sc.nextInt());
		 System.out.println(" enetr the id:"+employee.getId());
		 System.out.println(" enetr the name:"+employee.getName());
		 System.out.println(" enetr the salary:"+employee.getSalary());
		 con();
	}
	public static void con()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for continue press any to exit");
		int c=sc.nextInt();
		if(c==1)
		{
			selection();
		}
		else
		{
			System.out.println("======completed your all Queries========");
		}
	}
		
	public static void main(String[] args) {    

	    selection();  
	      
	}    
}
