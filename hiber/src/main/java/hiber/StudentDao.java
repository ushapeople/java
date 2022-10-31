package hiber;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class StudentDao {

    public void insertStudent() {
        Transaction transaction = null;
        try (Session session = Hibernateunit.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

      String hql = "INSERT INTO Student (first_name, last_name, email) " +"SELECT first_name, last_name, email FROM Student2";
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateStudent(Student2 student) {
        Transaction transaction = null;
        try (Session session = Hibernateunit.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // save the student object
            String hql = "UPDATE Student set first_Name = :first_name " + "WHERE id = :Id";
            Query query = session.createQuery(hql);
            query.setParameter("firstName", student.getFirst_name());
            query.setParameter("studentId", 1);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {

        Transaction transaction = null;
        try (Session session = Hibernateunit.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a student object
            Student2 student = session.get(Student2.class, id);
            if (student != null) {
                String hql = "DELETE FROM Student " + "WHERE id = :studentId";
                Query query = session.createQuery(hql);
                query.setParameter("studentId", id);
                int result = query.executeUpdate();
                System.out.println("Rows affected: " + result);
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Student2 getStudent(int id) {

        Transaction transaction = null;
        Student2 student = null;
        try (Session session = Hibernateunit.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // get an student object
            String hql = " FROM Student S WHERE S.id = :studentId";
            Query query = session.createQuery(hql);
            query.setParameter("studentId", id);
            List results = query.getResultList();

            if (results != null && !results.isEmpty()) {
                student = (Student2) results.get(0);
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return student;
    }

    public List < Student2 > getStudents() {
        try (Session session = Hibernateunit.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student2.class).list();
        }
    }

	public void saveStudent(Student2 student) {
		// TODO Auto-generated method stub
		
	}

}