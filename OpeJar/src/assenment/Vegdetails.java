package assenment;
import java.util.*;
	public class Vegdetails
	{
		static double final_price;
		static double budget=2500;
		static Scanner sc = new Scanner(System.in);
		public static void vegitables()
		{
			System.out.println("Select the Item you want\n1.Carrot\n2.Brinjal\n3.Cucumber\n4.Beans");
			int v = sc.nextInt();
			if(v==1)
			{
				carrot();
			}
			else if(v==2)
			{
				brinjal();
			}
			else if(v==3)
			{
				cucumber();
			}
			else if(v==4)
			{
				beans();
			}
			else
			{
				System.out.println("No item in this item \nlease select again");
				vegitables();
			}
		}
		public static void beans()
		{
			double beans = 60;
			System.out.println("Enter the no of kgs you want per KG : "+beans+"/-");
			int q = sc.nextInt();
			final_price = final_price+(q*beans);
			budget = budget - (q*beans);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("You are selected "+q+" kg's of Beans Your price for this item is : "+(q*beans));
			System.out.println("Available Balance is : "+budget);
			System.out.println("-----------------------------------------------------------------------------");
			bal();
		}
		public static void cucumber()
		{
			double cum = 40;
			System.out.println("Enter the no of kgs you want per KG : "+cum+"/-");
			int q = sc.nextInt();
			final_price = final_price+(q*cum);
			budget = budget - (q*cum);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("You are selected "+q+" kg's of Cucumber Your price for this item is : "+(q*cum));
			System.out.println("Available Balance is : "+budget);
			System.out.println("-----------------------------------------------------------------------------");
			bal();
		}
		public static void brinjal()
		{
			double bri = 50;
			System.out.println("Enter the no of kgs you want per KG : "+bri+"/-");
			int q = sc.nextInt();
			final_price = final_price+(q*bri);
			budget = budget - (q*bri);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("You are selected "+q+" kg's of Brinjal Your price for this item is : "+(q*bri));
			System.out.println("Available Balance is : "+budget);
			System.out.println("-----------------------------------------------------------------------------");
			bal();
		}
		public static void carrot()
		{
			double car = 60;
			System.out.println("Enter the no of kgs you want per KG : "+car+"/-");
			int q = sc.nextInt();
			final_price = final_price+(q*car);
			budget = budget - (q*car);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("You are selected "+q+" kg's of Carrot Your price for this item is : "+(q*car));
			System.out.println("Available Balance is : "+budget);
			System.out.println("-----------------------------------------------------------------------------");
			bal();
		}
		public static void process()
		{
			System.out.println("Enter \n1.Continue\n2.Final Bill");
			int p = sc.nextInt();
			if(p==1)
			{
				vegitables();
			}
			else if(p==2)
			{
				System.out.println("==================\nYour Final Price is "+final_price+"\n==================");
			}
			else
			{
				System.out.println("No option  \nlease select again");
				process();
			}
		}
		public static void bal()
		{
			if(final_price<=0)
			{
				System.out.println("Insufficient Balance");
			}
			else
			{
				process();
			}
		}
		public static void main(String[] args)
		{
			System.out.println("-----Welcome to market-----");
			vegitables();
		}
	}