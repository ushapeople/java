package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Inserting {
	public static void main(String[] args) {
		 
	    // Get session factory using Hibernate unit class
	    SessionFactory sf = Hibernateunit.getSessionFactory();
	    // Get session from Sesson factory
	    Session session = sf.openSession();
	 
	    // Begin transaction
	    Transaction t = session.beginTransaction();
	   
	    //Create Applicant Model data
	    Student2 student1 = new Student2();
	    student1 .setFirst_name("usha");
	    student1 .setLast_name("wadedor");
	    student1 .setEmail(" ushawadedor@gmail.com");
	   
	   
	    Student2 student2 = new  Student2();
	    student2.setFirst_name("ashok");
	    student2.setLast_name("hasgond");
	    student2.setEmail("ashokhasgond@gmail.com");
	   
	 
	   
	    session.save(student1);
	    session.save(student2);
	 
	    // Commit the transaction and close the session
	    t.commit();
	   
	    session.close();
	    System.out.println("successfully persisted Student details");
	 
	    }

}
