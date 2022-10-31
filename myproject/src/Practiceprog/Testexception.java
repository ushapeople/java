package Practiceprog;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Testexception {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your numbers");
		int a,b,c;
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(c);
			}
		catch(Exception e) {
			System.out.println("do proper input");
			Testexception.main(args);
		}
	}
	

}
