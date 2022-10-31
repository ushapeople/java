package collection;
import java.util.*;

class GFG {
 
    String name;
    int rollNo;
 
    // constructor of class GFG
    GFG(String s, int n)
    {
        name = s;
        rollNo = n;
    }
 
    // over-riding the toString method
    // to print the collection
    public String toString()
    {
        return "Name : " + name + " | Roll No : " + rollNo;
    }
 
    // Driver Main Method
    public static void main(String[] args)
    {
        // creating an arraylist of user-defined collection
        ArrayList<GFG> arr = new ArrayList<GFG>();
 
        // creating objects of class GFG
        GFG t1 = new GFG("John", 101);
        GFG t2 = new GFG("Paul", 102);
        GFG t3 = new GFG("Jack", 103);
        GFG t4 = new GFG("Jose", 104);
 
        // adding objects to arraylist
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);
 
        // printing the collection
        for (GFG c : arr)
            System.out.println(c);
    }
}