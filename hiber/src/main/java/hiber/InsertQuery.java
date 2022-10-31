package hiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class InsertQuery {

	 public static void main(String[] args) {
	        // Get session factory using Hibernate Util class
	        SessionFactory sf = Hibernateunit.getSessionFactory();
	        // Get session from Sesson factory
	        Session session = sf.openSession();
	        Query query = session.createQuery("insert into demo.Student2(id, first_name,last_name,email)select id, first_name,last_name  student2");
	        // Begin transaction
	        Transaction t = session.beginTransaction();
	        int result = query.executeUpdate();
	        // Commit the transaction and close the session
	        t.commit();
	        System.out.println("No of rows inserted: "+result);
	       
	        session.close();
	    }
	
}
