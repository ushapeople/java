package Practiceprog;

import java.util.Scanner;

public class Bill {
	public static int ac1=1000;
	public static int v1=1200;
	public static int nonac1=1000;
	public static int v2=1400;
	public static int ac2=2000;
	public static int nonac2=1500;
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Room Booking System");
		System.out.println("Enter the location you want to book");
		String[] city = new String[2];
		city[0]="Delhi";
		city[1]="Bangalore";
		System.out.println("Enter the name of the city correctly given below\n1.Delhi\n2.Bangalore");
		String city1 = sc.nextLine();
		if(city1.equals(city[0]))
		{
			System.out.println("--------Welcome to Delhi-------");
			System.out.println("Please select the Hotel..");
			System.out.println("\n1.leela palace\n2.Taj palace");
			int ht = sc.nextInt();
			if(ht==1)
			{
				System.out.println("Please enter the room type:\n1.AC\n2.NON-AC");
				int ac = sc.nextInt();
				if(ac==1)
				{
					System.out.println("You are selected ==AC== room With cost :"+(Bill.ac1));
					System.out.println("");
					System.out.println("Please enter the View from room:\n1.Mountain\n2.Pool");
					int v= sc.nextInt();
					if(v==1)
					{
					System.out.println("You are Selected ==Mountain== view");
					System.out.println("please select the no of members in your family");
					int m = sc.nextInt();
					if (m>0&&m<=4)
					{
						System.out.print("In  please enter the no of Childrens who are having age< 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0)
						{
							System.out.println("Your room is booked on mountain view with the cost of "+Bill.v1+Bill.ac1);
						}
						else
						{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.v1+750+Bill.ac1));
						}
					}
					else
					{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String k1="y";
						String k = sc.next();
						if(k1.contentEquals(k))
						{
							System.out.println("Your room is booked with the cost of"+(Bill.ac1+Bill.v1+500));
						}
						else
						{
							System.out.println("Your booking is not happened right now");
						}
					}
					}
					else
					{
						System.out.println("You are Selected ==Pool== view");
						System.out.println("please select the no of members in your family");
						int m = sc.nextInt();
						if (m>0&&m<=4)
						{
							System.out.print("In  please enter the no of Childrens who are having age<12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0)
							{
								System.out.println("Your room is booked on Pool view with the cost of "+(Bill.v2+Bill.ac1+350));
							}
							else
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2+Bill.ac1)+(750)));
							}
						}
						else
						{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String k1="y";
							String k = sc.next();
							if(k1.contentEquals(k))
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2+Bill.ac1)+(750)));
							}
							else
							{
								System.out.println("Your not Booking any room");
							}
						}
					}
				}
				else
				{
					System.out.println("You are selected NON-AC room with cost:"+Bill.nonac1);
					System.out.println("");
					System.out.println("Please enter the View from room:\n1.Mountain\n2.Pool");
					int v= sc.nextInt();
					if(v==1)
					{
					System.out.println("You are Selected Mountain view");
					System.out.println("please select the no of members in your family");
					int m = sc.nextInt();
					if (m>0&&m<=4)
					{
						System.out.print("In  please enter the no of Childrens who are having age<12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0)
						{
							System.out.println("Your room is booked on mountain view with the cost of "+(Bill.nonac1+Bill.ac2+Bill.v2));
						}
						else
						{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.nonac1+750+Bill.ac1+500));
						}
					}
					else
					{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String k1="y";
						String k = sc.next();
						if(k1.contentEquals(k))
						{
							System.out.println("Your room is booked with the cost of "+(Bill.ac1+Bill.v1+500));
						}
						else
						{
							System.out.println("Your not booking any room");
						}
					}
					}
					else
					{
						System.out.println("You are Selected Pool view");
						System.out.println("please select the no of members in your family");
						int m = sc.nextInt();
						if (m>0&&m<=4)
						{
							System.out.print("In  please enter the no of Childrens who are having age<12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0)
							{
								System.out.println("Your room is booked on Pool view with the cost of "+(Bill.nonac2+500+Bill.v2));
							}
							else
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.nonac2)+(750)+(Bill.v1)+500));
							}
						}
						else
						{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String k1="y";
							String k = sc.next();
							if(k1.contentEquals(k))
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else
							{
								System.out.println("Your not booked any room");
							}
						}
					}}}}
		if(city1.equals(city[1]))
		{
			System.out.println("----------Welcome to mysore------");
			System.out.println("Please select the Hotel..");
			System.out.println("\n1.ITC Kohinoor\n2.Hotel Taj");
			int ht = sc.nextInt();
			if(ht==1)
			{
				System.out.println("Please enter the room type:\n1.AC\n2.NON-AC");
				int ac = sc.nextInt();
				if(ac==1)
				{
					System.out.println("You are selected ==AC== room With cost :"+(Bill.ac1));
					System.out.println("");
					System.out.println("Please enter the View from room:\n1.Mountain\n2.Pool");
					int v= sc.nextInt();
					if(v==1)
					{
					System.out.println("You are Selected ==Mountain== view");
					System.out.println("please select the no of members in your family");
					int m = sc.nextInt();
					if (m>0&&m<=4)
					{
						System.out.print("In  please enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0)
						{
							System.out.println("Your room is booked on mountain view with the cost of "+Bill.v1);
						}
						else
						{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.v1+750));
						}
					}
					else
					{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String k1="y";
						String k = sc.next();
						if(k1.contentEquals(k))
						{
							System.out.println("Your room is booked");
						}
						else
						{
							System.out.println("Your booking is not happened right now");
						}
					}
					}
					else
					{
						System.out.println("You are Selected ==Pool== view");
						System.out.println("please select the no of members in your family");
						int m = sc.nextInt();
						if (m>0&&m<=4)
						{
							System.out.print("In  please enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0)
							{
								System.out.println("Your room is booked on Pool view with the cost of "+Bill.v2);
							}
							else
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
						}
						else
						{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String k1="y";
							String k = sc.next();
							if(k1.contentEquals(k))
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else
							{
								System.out.println("Your booking is not happened right now");
							}
						}
					}
				}
				else
				{
					System.out.println("You are selected NON-AC room with cost:"+Bill.nonac1);
					System.out.println("");
					System.out.println("Please enter the View from room:\n1.Mountain\n2.Pool");
					int v= sc.nextInt();
					if(v==1)
					{
					System.out.println("You are Selected Mountain view");
					System.out.println("please select the no of members in your family");
					int m = sc.nextInt();
					if (m>0&&m<=4)
					{
						System.out.print("In  please enter the no of Childrens who are having age below 12 :");
						int ch = sc.nextInt();
						if(ch<=2&&ch>0)
						{
							System.out.println("Your room is booked on mountain view with the cost of "+Bill.nonac1);
						}
						else
						{
							System.out.println("Your room is booked on mountain view with extra cost of "+(Bill.nonac1+750));
						}
					}
					else
					{
						System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
						System.out.println("Press y from confirm booking");
						String k1="y";
						String k = sc.next();
						if(k1.contentEquals(k))
						{
							System.out.println("Your room is booked");
						}
						else
						{
							System.out.println("Your booking is not happened right now");
						}
					}
					}
					else
					{
						System.out.println("You are Selected Pool view");
						System.out.println("please select the no of members in your family");
						int mem = sc.nextInt();
						if (mem>0&&mem<=4)
						{
							System.out.print("In  please enter the no of Childrens who are having age below 12 :");
							int ch = sc.nextInt();
							if(ch<=2&&ch>0)
							{
								System.out.println("Your room is booked on Pool view with the cost of "+Bill.nonac2);
							}
							else
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.nonac2)+(750)));
							}
						}
						else
						{
							System.out.println("You have More than 4 members in your family you have want to take extra room with extra payment ");
							System.out.println("Press y from confirm booking");
							String ok1="y";
							String ok = sc.next();
							if(ok1.contentEquals(ok))
							{
								System.out.println("Your room is booked on Pool view with extra cost of "+((Bill.v2)+(750)));
							}
							else
							{
								System.out.println("Your booking is not happened right now");
							}
						}
					}
					
				}
			}
		}
	}
}
	
