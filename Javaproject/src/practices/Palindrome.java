package practices;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a string for checking as palindrome:");
	String word=sc.next();
	
	if(ispalindrome(word))
		System.out.println("\""+word+"\" is A palindrome");
	else
		System.out.println("\""+word+"\" is NOT palindrome");
}

 static boolean ispalindrome(String word) {
	int forwardIndex=0,backwardIndex=word.length()-1;
	while(forwardIndex<=backwardIndex) {
		char startChar=word.charAt(forwardIndex);
		char endChar=word.charAt(backwardIndex);
		if(startChar != endChar)
			return false;
		forwardIndex++;
		backwardIndex--;
	}
	return true;
}

}
