package hiber;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class SelectQuery {
	 public static void main(String[] args) {
	        // Get session factory using Hibernate Util class
	        SessionFactory sf = Hibernateunit.getSessionFactory();
	        // Get session from Sesson factory
	        Session session = sf.openSession();
	        @SuppressWarnings("rawtypes")
	        Query query = session.createQuery("from Student2");
	        List<Student2> list = query.getResultList();
	        System.out.println("Number of Students2 present--> "+list.size());
	        for (Student2 applicant : list) {
	           
	            System.out.println(applicant.getId());
	            System.out.println(applicant.getFirst_name());
	        }
	       
	        session.close();
	    }
}
