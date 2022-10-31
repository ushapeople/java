package assenment;

public class Poly2 extends Poly1 {
	public Object m1()
	{
		System.out.println("overloading");
		return this;
	}
	public static void main(String[] args) {
		Poly1 obj=new Poly2();
		System.out.println(obj.m1());
	}
	

}


