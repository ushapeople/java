package myprastice;

import java.util.Scanner;

public class StudentMarks {
private static Scanner sc;
public static void main(String[] args) {
	int english,chemistry,computer,physics,maths;
	float total,percentage,Average;
	sc=new Scanner(System.in);
	
	System.out.println("Enter five subject marks: ");
	english=sc.nextInt();
	chemistry=sc.nextInt();
	computer=sc.nextInt();
	physics=sc.nextInt();
	maths=sc.nextInt();
	
	total=english+chemistry+computer+physics+maths;
	Average=total/5;
	percentage=(total/500) * 100;
	
	System.out.println("Total Marks= " + total);
	System.out.println("Average Marks=" + Average);
	System.out.println("Marks percentage=" +percentage);
}
}
