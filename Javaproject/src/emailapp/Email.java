package emailapp;

import java.util.Scanner;

public class Email {

private	String firstName;
private	String lastName;
private	String password;
private	String department;
private	int mailboxCapacity=500;
private String alternateEmail;
private int defaultPasswordLength=5;
private String email;
private String companySuffix="aeycompany.com";

public Email(String firstName, String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("EMAIL CREATED:" + this.firstName +" "+this.lastName);
	
this.department=setDepartment();
System.out.println("Department:" + this.department);

this.password=randomPassword(defaultPasswordLength);
System.out.println("Your Password is:" + this.password);

email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//System.out.println("your email is:" + email);
}

private String setDepartment() {
 System.out.println("New worker: " + firstName+ ".DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n4 for none\n Enter department code:");
 Scanner in=new Scanner(System.in);
 int depChoice=in.nextInt();
 if(depChoice==1) { return"sales"; }
 else if(depChoice==2) {return "dep"; }
 else if(depChoice==3) {return "acc";}
 else { return"";}
 }
	
	private String randomPassword(int length) {
		String PasswordSet="USHA@!@#$";
		char[] password=new char[length];
		for(int i=0; i<length; i++) {
		int rand=(int) (Math.random() * PasswordSet.length());
		password[i]=PasswordSet.charAt(rand);
//		System.out.println(rand);
//		System.out.println(PasswordSet.charAt(rand));
		}
		return new String(password);
	}
	
public void setMailboxCapacity(int capacity) {
	this.mailboxCapacity=capacity;	
	}
	
public void setAlternateEmail(String altEmail) {
this.alternateEmail=altEmail;	
}

public void changePassword(String password) {
	this.password=password;
}

public int getMailCapacity(){ return mailboxCapacity;}
public String getAlternateEmail() { return alternateEmail;}
public String getpassword() {return password;}

public String showInfo() {
	return "DISPLAY NAME: " + firstName + " "+lastName +
			"\nCOMPANY EMAIL: " + email +
			"\nMAILBOX CAPACITY: " + mailboxCapacity  + "mb";
}
}


