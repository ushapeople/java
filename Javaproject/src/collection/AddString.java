package collection;

import java.util.ArrayList;

public class AddString {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
//	
//	al.add("usha");
//	al.add("usha");
//	//adding name in 1st index
//	al.add(1,"Ashok");
//	System.out.println(al);
	
al.add("usha");
al.add("usha");
al.add("manu");
System.out.println("Initial Arraylist:" + al);
	al.set(1, "Ashok");
System.out.println("Updated Arraylist:" + al);
al.remove(2);
System.out.println("after removing:" + al);
}
}
