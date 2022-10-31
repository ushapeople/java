package Assignment2;

import java.util.Scanner;

public class Billing {
	
	 static int mb;
	 static int buject=120000;
	 public static void billing()
	 {
		 Scanner sc = new Scanner(System.in);
		 int price1,price2,price3,price4;
		
		 System.out.println("select the selection");
		 System.out.println("Enter \\n1.Eloectronics\\n2.Bath\\n3.Kitchen\\n4.Cloths");
		 int n = sc.nextInt();
		  if(n==1)
    {
    System.out.println(" Here Electronic items");
   System.out.println("select the items 1.mobile\2.bluetooth");
    int a=sc.nextInt();
    if(a==1) 
    {
    	 System.out.println("mobile cost is:15000");
    	    System.out.println("how many u want");
    	    int b=sc.nextInt();
    System.out.println("mobile price is:"+(price1=b*15000));
    mb=mb+price1;
    shopping();
    }
    else if(a==2) {
    System.out.println("2nd item Bluetooth cost is:1500");
    System.out.println("how many u want");
    int blu=sc.nextInt();
	System.out.println("Bluetooth price is:"+(price1=blu*1500));
    mb=mb+price1;
    shopping();
     }
    else
    {
    	System.out.println("not selected any items");
    }
    }
      
		   else if(n==2)
		    {
		    System.out.println("Bath items ");
		    System.out.println("select the items 1.soap\2.facewash");
		    int c=sc.nextInt();
		    if(c==1) {
		    	System.out.println("Soap cost is: 79");
			    System.out.println("how many u want");
			    int s=sc.nextInt();
		    System.out.println("soap cost is:"+(price2=c*79));
		    mb=mb+price2;
		    shopping();
		    }
		    else if(c==2)
		    {
		    System.out.println("2nd item Face wash cost is:145");
		    System.out.println("how many u want");
		    int bt=sc.nextInt();
		    System.out.println(" cost is:"+(price2=bt*145));
		    mb=mb+price2;
		    shopping();
		    }
		    else
		    {
		    	System.out.println("not selected any items");
		    }
		    }
		  
		  else if(n==3)
		    {
		    System.out.println("kitchen items ");
		    System.out.println("select the items 1.gas\2.cooker");
            int b=sc.nextInt();
		   if(b==1)
		    {
		   System.out.println("Gas cost is: 12000");
	       System.out.println("how many u want");
		 int k=sc.nextInt();
		    System.out.println("Gas cost is:"+(price3=b*12000));
		    mb=mb+price3;
		    shopping();
		    }
		  else if(b==2)
		  {
		    System.out.println("2nd item cooker cost is:3000");
		    System.out.println("how many u want");
		    int ki=sc.nextInt();
		    System.out.println(" cost is:"+(price3=ki*3000));
		    mb=mb+price3;
		    shopping();
		     }
		  else
		    {
		    	System.out.println("not selected any items");
		    }
		   }
		  else if(n==4)
		    {
		    System.out.println("cloths items ");
		    System.out.println("select the items 1.saree\2.dressmaterial");
		    
		    int d=sc.nextInt();
		    if(d==1) {
		    System.out.println("saree cost is: 1200");
		    System.out.println("how many u want");
		    int sar=sc.nextInt();
		    
		    System.out.println("saree cost is:"+(price4=d*12000));
		    mb=mb+price4;
		    shopping();}
		    else  if(d==2) 
		    {
		    System.out.println("2nd item dressmaterial cost is:670");
		    System.out.println("how many u want");
		    int ct=sc.nextInt();
		    System.out.println(" cost is:"+(price4=ct*3000));
		    mb=mb+price4;
		    shopping();
		     }
		  else
		    {
		        System.out.println("others");
		       
		 }}
}
	private static void shopping() {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter 1 if u want to continue press 2 to exit");
		  int e=sc.nextInt();
		  if(e==1)
		  {
			  billing();
		  }
		  else 
		  {
			  System.out.println("final cost is:"+mb);
			  System.out.println("my buject is:"+buject);
			  System.out.println("my remaining buject is"+(buject-mb));
			System.out.println("thank you visit again");
		  }
	  }
 public static void main(String[] args) {
		Billing b=new Billing();
		b.billing();
	}
}
