package collection;

import java.util.Vector;

public class CollectionNumber {
public static void main(String[] args) {
	
	
	Vector v=new Vector();
	
		v.add(1);
		v.add(2);
		v.add(3);
		v.add("usha");
		v.add("ashok");
		v.add(4);
		System.out.println(v);
		
		v.remove(3);
		v.set(1, "usha");
//		System.out.println("after removing:" + v);
		
		for(int i =0; i< v.size();i++)
	{
			System.out.print(v.get(i)+ " ");
	}

}
}
