package finalassegnment;

import java.util.Scanner;

public class Anagram2 {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Enter the 1st string");
//	        String s1=sc.nextLine();
//	        System.out.println("Enter the 2nd string");
//	        String s2=sc.nextLine();
	        String s1="KNOT";
	        String s2="NOTE";
           int count=0;
	        for(int i=0;i<s1.length();i++) {
	        	
	            for(int j=0;j<s1.length();j++) {
	                if(s1.charAt(i)==s2.charAt(j)) {
	                    count++;
	                }  }
              }
	        if(count==s1.length()) {
	            if(count==s2.length())
	                System.out.println(s1+"  anagram  "+s2);
	            else {
	                System.out.println(s1+"  not anagram  "+s2);
	            }

           }else {
	            System.out.println(s1+"  not anagram  "+s2);
	        }
	        }
}
