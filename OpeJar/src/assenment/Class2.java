package assenment;

public class Class2 {
	public int m1(int a) {
		System.out.println("overloading m1 int");
		return 0;
	}
	
	public int m1(String a) {
		System.out.println("overloading m1 string");
		return 0;
	}
	public int m2(int a) {
		System.out.println("overloading m1 string");
		return 1;
	}
	public void showcase(int a) {
switch(a)
{
case 1:System.out.println(" run the polymorphism");
break;
case 0:System.out.println("compile time polymorphism");
break;
}
		
	}
}
