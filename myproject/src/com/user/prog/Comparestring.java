package com.user.prog;

public class Comparestring {
	public static void main(String args[])
	{
		String first="usha";
		String second="Ashok";
		String third="Ashok";
		boolean result1=first.equals(second);
		System.out.println("String first and second are equal:"+result1);
		boolean result2=second.equals(third);
		System.out.println("String second and third are equal:"+result2);
	}

}
