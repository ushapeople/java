package assenment;

public class Class1 extends Class2 {
	public int m2(int a)
	{
		System.out.println("overloading m1 string");
		return 1;
	}
	public static void main(String[] args) {
		Class2 obj=new Class1();
		int a=obj.m1(10);
	    obj.showcase(a);
		int a1=obj.m1("usha");
		obj.showcase(a1);
		int b=obj.m2(10);
	    obj.showcase(b);
	}

}
