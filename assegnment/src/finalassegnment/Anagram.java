package finalassegnment;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string1");
//		String s1=sc.nextLine();
//		System.out.println("enter String2");
//		String s2=sc.nextLine();
		String s1="SHORE";
		String s2="HORSE";
		if(s1.length()==s2.length())
		{
			if(s1.contentEquals(s2))
			{
				System.out.println("are  anagrams");
			}
		
		else {
			System.out.println("not anagrams");
		}}
		
	}
}
