package Assegnment3;

import java.beans.Statement;
import java.sql.Connection;
import java.util.Scanner;

public class Product
{
	int pro_id;
	String Pro_name;
	String pro_category;
	int pro_price;
	String pro_descri;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return Pro_name;
	}
	public void setPro_name(String pro_name) {
		Pro_name = pro_name;
	}
	public String getPro_category() {
		return pro_category;
	}
	public void setPro_category(String pro_category) {
		this.pro_category = pro_category;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_descri() {
		return pro_descri;
	}
	public void setPro_descri(String pro_descri) {
		this.pro_descri = pro_descri;
	}
	
	public void billing() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Well come to Electronic item ");
		System.out.println("enter your pro_id");
		int id=sc.nextInt();
		System.out.println("enter your pro_name");
		String name=sc.next();
		System.out.println("ener your pro_cate");
		String category=sc.next();
		System.out.println("ener your pro_price");
		int price=sc.nextInt();
		System.out.println("ener your pro_descri");
		String descri=sc.next();
		try
        {
			
           Connection con = Connection.getConnection();
             Statement stmt= (Statement) con.createStatement();
             stmt.executeUpdate("insert into electronic(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) value('"+electronic.getpro_Id()+"','"+electronic.getUsername()+"','"+employee.getPassword()+"')");
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
		public  void kit()
		{
		
			System.out.println("Well come to kitchen item ");
			Scanner sc1=new Scanner(System.in);
			
			System.out.println("enter your pro_id");
			int id1=sc.nextInt();
			System.out.println("enter your pro_name");
			String name1=sc.next();
			System.out.println("ener your pro_cate");
			String category1=sc.next();
			System.out.println("ener your pro_price");
			int price1=sc.nextInt();
			System.out.println("ener your pro_descri");
			String descri1=sc.next();
			try
	        {
				
	           Connection con = Connection.Connection();
	             Statement stmt= (Statement) con.createStatement();
	             stmt.executeUpdate("insert into kitchen(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) value('"+electronic.getpro_Id()+"','"+electronic.getUsername()+"','"+employee.getPassword()+"')");
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
			
			pubilc static void Home()
			{
				System.out.println("Well come to home item ");
				Scanner sc11=new Scanner(System.in);
				
				System.out.println("enter your pro_id");
				int id1=sc.nextInt();
				System.out.println("enter your pro_name");
				String name1=sc.next();
				System.out.println("ener your pro_cate");
				String category1=sc.next();
				System.out.println("ener your pro_price");
				int price1=sc.nextInt();
				System.out.println("ener your pro_descri");
				String descri1=sc.next();
				try
		        {
					
		           Connection con = Connection.Connection();
		             Statement stmt= (Statement) con.createStatement();
		             stmt.executeUpdate("insert into kitchen(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) value('"+electronic.getpro_Id()+"','"+electronic.getUsername()+"','"+employee.getPassword()+"')");
		        }
		        catch(Exception e)
		        {
		            System.out.println(e);
		        }
				public static void result()
				{
					System.out.println("Well come to result item ");
					Scanner sc1=new Scanner(System.in);
					
					System.out.println("enter your pro_id");
					int id1=sc.nextInt();
					System.out.println("enter your pro_name");
					String name1=sc.next();
					System.out.println("ener your pro_cate");
					String category1=sc.next();
					System.out.println("ener your pro_price");
					int price1=sc.nextInt();
					System.out.println("ener your pro_descri");
					String descri1=sc.next();
					try
			        {
						
			           Connection con = Connection.Connection();
			             Statement stmt= (Statement) con.createStatement();
			             stmt.executeUpdate("insert into kitchen(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) value('"+electronic.getpro_Id()+"','"+electronic.getUsername()+"','"+employee.getPassword()+"')");
			        }
			        catch(Exception e)
			        {
			            System.out.println(e);
			        }
					
				}
				
			}
		}
		}
	
}
