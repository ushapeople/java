package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DeleteQuery {

	  public static void main(String[] args) {
	        // Get session factory using Hibernate Util class
	        SessionFactory sf = Hibernateunit.getSessionFactory();
	        // Get session from Sesson factory
	        Session session = sf.openSession();
	        Query query = session.createQuery("delete from Student2Backup where id=:id");
	        query.setParameter("id", 1);
	        // Begin transaction
	        Transaction t = session.beginTransaction();
	        int result = query.executeUpdate();
	        // Commit the transaction and close the session
	        t.commit();
	        System.out.println("No of rows Deleted: "+result);
	       
	        session.close();
	    }
	
}
