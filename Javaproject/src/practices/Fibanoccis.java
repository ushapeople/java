package practices;

import java.util.Scanner;

public class Fibanoccis {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("how many fibanoccis series numbers:");
	int num=sc.nextInt();
	displayFibanocciseries(num);
	sc.close();
}
 static void displayFibanocciseries(int n) {
	 int x=0,y=1,z=0,count=1;
	 while(count<=n) {
		 System.out.print(z+" ");
		 z=x+y;
		 x=y;
		 y=z;
		 count++;
	 }
 }
}
