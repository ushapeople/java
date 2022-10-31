

import java.sql.Connection;
import java.sql.Statement;

import p1.Connectionfactory;

public class AddServices  implements AddDao{

	@Override
	public void add(Add add) {
		try
        {
			
            Connection con = Connectionfactory.getConnection();

			 Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into employee1(name`,`password`) values('"+employee.getUsername()+"','"+employee.getPassword()+"')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void delete() {
		try
		{
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			 stmt.executeUpdate("delete from  employee1 where  name='"+employee.getUsername()+"' ");

			
		}
		catch (Exception e){
			
			System.out.println(e);
		}
	}
		
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
	

}
