package hiber;

import java.util.List;

public class App {
	    public static void main(String[] args) {
	        StudentDao studentDao = new StudentDao();
	        Student2 student = new Student2();
	        studentDao.saveStudent(student);

	        studentDao.insertStudent();

	        // update student
	        Student2 student1 = new Student2();
	        studentDao.updateStudent(student1);

	        // get students
	        List < Student2 > students = studentDao.getStudents();
	        students.forEach(s - > System.out.println(s.getFirst_name()));

	        // get single student
	        Student2 student2 = studentDao.getStudent(1);
	        System.out.println(student2.getFirst_name());

	        // delete student
	        studentDao.deleteStudent(1);
	    }
	}


