package p2;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import p1.Connectionfactory;

public class EmployeeService implements EmployeeDao 
	{

	public void AddElectronic()
	{
		try
        {
			
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM usha.electronics");
			System.out.println("pro_id\tpro_name\tpro_cate\tpro_price\tpro_descri");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
	
			}
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void Home() {
		try
        {
			
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM usha.home");
			System.out.println("pro_id\tpro_name\tpro_cate\tpro_price\tpro_descri");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
	
			}
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void Kitchen() {
		try
        {
			
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM usha.kitchen");
			System.out.println("pro_id\tpro_name\tpro_cate\tpro_price\tpro_descri");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
	
			}
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void result() {
		try
        {
			
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM usha.result");
			System.out.println("pro_id\tpro_name\tpro_cate\tpro_price\tpro_descri");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"  \t"+rs.getString(3)+"  \t"+rs.getDouble(4)+"  \t"+rs.getString(5));
	
			}
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	
	
	}

	

	