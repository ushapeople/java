package Practiceprog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class studentprint
{
	public static void main(String args[]) {
		int total[]=new int[6];
		String name[]=new String[6];
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" driver found");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
		java.sql.Statement statement=connection.createStatement();
		ResultSet set=((java.sql.Statement) statement).executeQuery("SELECT * FROM usha.student2");
			while(set.next())
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3)+" "+set.getInt(4)+" "+set.getInt(5));
			{
				//name[i]=set.getString(2);
				System.out.println();
				}
			for(i=0;i<5;i++)
			{
				System.out.println(name[i]+" scored "+total[i]);
			}
			
		 }
		catch (Exception e) {
			System.out.println(e);
		}
		}

}
