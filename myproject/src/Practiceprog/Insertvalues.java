package Practiceprog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insertvalues 
{
	public static void main(String[] args) {
		System.out.println("enter your values");
		//int empid;//
		String name;
		int cla,java,html;
		Scanner sc=new Scanner(System.in);
		//empid=sc.nextInt();//
		name=sc.next();
		cla=sc.nextInt();
		java=sc.nextInt();
		html=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" driver found");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
			Statement statement=connection.createStatement();
		String query ="insert into usha.student2(`name`,`c la`,`java`,`html`)values('"+name+"','"+cla+"','"+java+"','"+html+"')";
		statement.executeUpdate(query);
		System.out.println("data inserted successfully");
		
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		}

}
//"delete from  DeleteTableDemo " +
//"where id=101";