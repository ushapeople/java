package p2;

import java.util.Scanner;

public class Provider
{
	static double final_price;
	static double budget=10000;
	static Scanner sc = new Scanner(System.in);
	static EmployeeService service = new EmployeeService();
	
public static void electronic()
{
	
    System.out.println(" Here Electronic items");
    service.AddElectronic();
    int e = sc.nextInt();
    double mobile = 15000;
    double w_m = 20000;
    double tv = 15000;
    double bt = 200;
    if(e==15)
    {
    	System.out.println("You are selected Mobile : "+mobile);
	    System.out.println("how many u want");
	    int b=sc.nextInt();
	    double price = b*mobile;
	    System.out.println("total mobile price is "+price);
	    final_price = final_price+price;
	    budget = budget-price;    
	    System.out.println("total final price till now is  "+final_price);
	    price();
    }
    else if(e==20)
    {
    	System.out.println("You are selected Washing Machine : "+w_m);
	    System.out.println("how many u want");
	    int b=sc.nextInt();
	    double price = b*w_m;
	    System.out.println("total mobile price is "+price);
	    final_price = final_price+price;
	    budget = budget-price;
	    System.out.println("total final price till now is  "+final_price);
	    price();
    }
    else if(e==30)
    {
    	System.out.println("You are selected tv : "+tv);
	    System.out.println("how many u want");
	    int b=sc.nextInt();
	    double price = b*tv;
	    System.out.println("total mobile price is "+price);
	    final_price = final_price+price;
	    budget = budget-price;
	    System.out.println("total final price till now is  "+final_price);
	    price();
    }
    else if(e==40)
    {
    	System.out.println("You are selected Bluetooth : "+bt);
	    System.out.println("how many u want");
	    int b=sc.nextInt();
	    double price = b*bt;
	    System.out.println("total mobile price is "+price);
	    final_price = final_price+price;
	    budget = budget-price;
	    System.out.println("total final price till now is  "+final_price);
	    price();
    }
    else
    {
    	System.out.println("Invalid selection");
    	electronic();
    }
	}

public static void home() {
	 System.out.println(" Here home items");
	    service.Home();
	    int h = sc.nextInt();
	    double hgd =568;
	    double cd= 325;
	    if(h==10)
	    {
	    	System.out.println("You are selected Hgd : "+ hgd);
		    System.out.println("how many u want");
		    int c=sc.nextInt();
		    double price = c* hgd;
		    System.out.println("total mobile price is "+price);
		    final_price = final_price+price;
		    budget = budget-price;    
		    System.out.println("total final price till now is  "+final_price);
		    price();
	    }
	    else if(h==20)
	    {
	    	System.out.println("You are selected Cd : "+ cd);
		    System.out.println("how many u want");
		    int d=sc.nextInt();
		    double price = d* cd;
		    System.out.println("total mobile price is "+price);
		    final_price = final_price+price;
		    budget = budget-price;    
		    System.out.println("total final price till now is  "+final_price);
		    price();
	    }
	    else
	    {
	    	System.out.println("Invalid selection");
	    	home();
	    }
        }
	
	
 public static void kitchen() 
	{
	 System.out.println(" Here kitchen items");
	    service.Kitchen();
	    int k = sc.nextInt();
	    double crtg =258;
	    double rtdbghtr=2587;
	   double brbh=1452;
	    if(k==40)
	    {
	    	System.out.println("You are selected Crtg: "+ crtg);
		    System.out.println("how many u want");
		    int c=sc.nextInt();
		    double price = c* crtg;
		    System.out.println("total mobile price is "+price);
		    final_price = final_price+price;
		    budget = budget-price;    
		    System.out.println("total final price till now is  "+final_price);
		    price();
	    }
	    else if(k==50)
	    {
	    	System.out.println("You are selected Rtdbghtr : "+ rtdbghtr);
		    System.out.println("how many u want");
		    int d=sc.nextInt();
		    double price = d* rtdbghtr;
		    System.out.println("total mobile price is "+price);
		    final_price = final_price+price;
		    budget = budget-price;    
		    System.out.println("total final price till now is  "+final_price);
		    price();
	    }
	    else if(k==60)
	    {
	    	System.out.println("You are selected Brbh: "+ brbh);
		    System.out.println("how many u want");
		    int d=sc.nextInt();
		    double price = d* brbh;
		    System.out.println("total mobile price is "+price);
		    final_price = final_price+price;
		    budget = budget-price;    
		    System.out.println("total final price till now is  "+final_price);
		    price();
	    }
	    else
	    {
	    	System.out.println("Invalid selection");
	    	kitchen();
	    }
	 }
	
	
	public static void result()
     {
		 System.out.println(" Here result items");
		    service.result();
		    int r = sc.nextInt();
		    double vgx =258;
		    double ht=2587;
		    if(r==14)
		    {
		    	System.out.println("You are selected vgx: "+vgx);
			    System.out.println("how many u want");
			    int c=sc.nextInt();
			    double price = c* vgx;
			    System.out.println("total mobile price is "+price);
			    final_price = final_price+price;
			    budget = budget-price;    
			    System.out.println("total final price till now is  "+final_price);
			    price();
		    }
		    else if(r==15)
		    {
		    	System.out.println("You are selected Ht : "+  ht);
			    System.out.println("how many u want");
			    int c=sc.nextInt();
			    double price = c*  ht;
			    System.out.println("total mobile price is "+price);
			    final_price = final_price+price;
			    budget = budget-price;    
			    System.out.println("total final price till now is  "+final_price);
			    price();
		    }
		    else
		    {
		    	System.out.println("Invalid selection");
		    	result();
		    }
		}
	public static void price()
	{
		if(final_price<=0)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			billing();
		}
	}
	public static void billing()
	{
		System.out.println("enter 1 for Shopping 2 for exit");
		int s=sc.nextInt();
		if(s==1)
		{
			process();
		}
		else
		{
			System.out.println("Your Final Bill was : "+final_price);
		}
	}
	private static void process()
	{
		System.out.println("Select the Catogery You Want\n1.Electronics\n2.Home\n3.Kitchen\n4.result");
		int p = sc.nextInt();
		if(p==1)
		{
			electronic();
		}
		else if(p==2)
		{
			home();
		}
		else if(p==3)
		{
			kitchen();
		}
		else if(p==4)
		{
			result();
		}
		else
		{
			System.out.println("Invalid selection");
			process();
		}
	}

	public static void main(String[] args) {
		billing();
	
	}
	}
	
	



