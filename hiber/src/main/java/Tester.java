

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester 
{
	public static void selection()
{

	Scanner sc=new Scanner(System.in);
	System.out.println("select\n1.insert\n2.delete\n3.update\n4.display");
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
		display();
    }
	else 
	{
		System.out.println("invalid selection");
	}
	}
	
	private static void display()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    System.out.println("works");
	    SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
	    Student student = new Student();
	    student=(Student)session.get(Student.class,2); 
	    System.out.println("student name is:"+student.getName());
	    student.setName("ashok");
	    System.out.println(student.getId()+" "+student.getName());
	    session.beginTransaction().commit();
	    
	    session.close();
	    con();
   }
	public static void insert()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    System.out.println("works");
	    SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
	    Student student = new Student();
	    student.setId(1); 
	    student.setName("manu");
        session.save(student);
	    session.beginTransaction().commit();
	    session.close();
	    con();
	}
	public static void delete()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    System.out.println("works");
	    SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
	    Student student = new Student();
	    student=(Student)session.get(Student.class,4); 
	    System.out.println("deleted name:"+student.getName());
	    student.setName("u");
	    session.delete(student);
  	    session.beginTransaction().commit();
	    session.close();
	    con();
	}
	public static void update()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    System.out.println("works");
	    SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
	    Student student = new Student();
	    student=(Student)session.get(Student.class,8); 
	    System.out.println("updated name is:"+student.getName());
	    student.setName("ashok");
	    session.update(student);
        session.save(student);
	    session.beginTransaction().commit();
	    session.close();
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
	
	public static void main(String[] args)
	{
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    System.out.println("works");
//	    SessionFactory factory = configuration.buildSessionFactory();
//	    Session session = factory.openSession();
//	    Student student = new Student();
//	    student.setId(1);
//	    student.setName("A");
//	    session.save(student);
//	    session.beginTransaction().commit();
//	
		selection();
		}
  }
