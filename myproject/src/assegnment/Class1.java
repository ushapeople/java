package assegnment;

public class Class1  extends Class2{
	 public int m2(int a)
	    {
	        System.out.println("overloading m2 string");
	        return 1;
	    }
	    public static void main(String[] args) {
	        Class2 obj=new Class1();
	        int a=obj.m1(10);
	        obj.showcase(a);
	        int b=obj.m1("usha");
	        obj.showcase(b);
	        int a1=obj.m2(15);
	        obj.showcase(a1);
	        
	    }
	

}
