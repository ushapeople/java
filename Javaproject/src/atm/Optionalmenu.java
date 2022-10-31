package atm;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Optionalmenu extends Account{
Scanner menuInput=new Scanner(System.in);
DecimalFormat moneyFormat=new DecimalFormat("`$`###,##0.00");
 HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
  
 public void getLogin() throws IOException{
	 int x=1;
	 do {
		 try {
			 data.put(988656, 9886);
			 data.put(935301, 9353);
			
	System.out.println("Well Come to ATM");
    System.out.println("Enter your Customer Number:");
    setCustomerNumber(menuInput.nextInt());
			 
			 System.out.println("enetr your pin number:");
			 setPinNumber(menuInput.nextInt());
	  }catch (Exception e) {
		  System.out.println("\n" + "Invalid character(s).only numbers" + "\n");
		  x=2;
	  }
		 for(Entry<Integer, Integer> entry : data.entrySet()) {
			 if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
			 {
				 getAccountType();
		 }
		 }
	 System.out.println("\n" + "Wrong customernumberor pinnumber" + "\n");
 }
while(x==1);
 }
 public void getAccountType() {
System.out.println("select the Account you want to access:");
System.out.println("Type 1- checking Account");
System.out.println("Type 2- saving Account");
System.out.println("Type 3-Exit");
System.out.println("choice:");

selection=menuInput.nextInt();
switch(selection) {
case 1:
	getChecking();
	break;
case 2:
	getSaving();
	break;
	
case 3:
	System.out.println("Thank you for visit \n ");
	break;
	
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getAccountType();
}
}
public void getChecking()
{
	System.out.println("checking Account:");
	System.out.println("Type 1-View Balance:");
	System.out.println("Type 2-Withdraw Funds:");
	System.out.println("Type 3-Deposit Funds:");
	System.out.println("Type 4-Exit:");
	System.out.println("choice:");
	
	selection=menuInput.nextInt();
	switch(selection) {
	case 1:
		System.out.println("checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
	getAccountType();
	break;
	
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("thank you for visiting ");
		break;
		
	default:
		System.out.println("\n" + "invalid choice" + "\n");
		getChecking();
	}
}
public void getSaving() {
	System.out.println("saving Account:");
	System.out.println("Type 1- view Balance:");
	System.out.println("Type 2- Withdraw Funds:");
	System.out.println("Type 3- Deposit Funds:");
	System.out.println("Type 4- Exit:");
	System.out.println("choice:");
	selection=menuInput.nextInt();
	
	switch(selection) {
	case 1:
		System.out.println("Saving account Balance: " +moneyFormat.format(getSavingBalance()));
	    getAccountType();
	    break;
	    
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getSavingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("Thank you for visiting");
		break;
		
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getSaving();
	}
	
}
int selection;

}
