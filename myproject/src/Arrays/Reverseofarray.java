package Arrays;
import java.util.Arrays;
public class Reverseofarray {
	
	public static void main(String[] args){   
	    int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1456};
	    
	  System.out.println("Original array : "+Arrays.toString(my_array1));  
	   for(int i = 0; i < my_array1.length / 2; i++)
	  {
	    int temp = my_array1[i];
	    my_array1[i] = my_array1[my_array1.length - i - 1];
	    my_array1[my_array1.length - i - 1] = temp;
	  }
	    System.out.println("Reverse array : "+Arrays.toString(my_array1));	    
	 }
	}



