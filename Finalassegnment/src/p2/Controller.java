package p2;


import java.util.Scanner;

public class Controller
{
	static Scanner sc = new Scanner(System.in);
    public static void operations()
    {
        System.out.println("Enter \n1.Insert\n2.Display\n3.Delete\n4.Update");
        int n = sc.nextInt();
        if(n==1)
        {
        System.out.println("Provide the details to add in data base");
        Object emp = null;
		Controller.insert(emp);
        }
        else if(n==2)
        {
        System.out.println("Your Data in Database is : ");
        Controller.Display();
        }
        else if(n==3)
        {
            delete();
            System.out.println("Data deleted");
        }
        else if(n==4)
        {
            
            System.out.println("");
        }
        else
        {
            System.out.println("Invalid selection\nSelect again");
            operations();
        }
    }
private static void insert(Object emp) {
		// TODO Auto-generated method stub
		
	}
static void Display() {
		// TODO Auto-generated method stub
		
	}
	//	private static void delete() {
//		// TODO Auto-generated method stub
//		
//	}
//	private static void display() {
//		// TODO Auto-generated method stub
//		
//	}
//	private static void insert(Employee employee) {
//		   Scanner sc=new Scanner(System.in);
//	        
//	        System.out.println("enter your password");
//	        String un=sc.next();
//	        String password=sc.next();
//	        Employee emp=new Employee();
//	        emp.setName(un);
//	        emp.setSalary();
//	        EmployeeService service=new EmployeeService();
//		
	private static void delete() {
		// TODO Auto-generated method stub
		
	}
	}
    
    