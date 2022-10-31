package Arrays;
import java.util.Arrays;

public class Removeofelements {
	
	 public static void main(String[] args) {
	   int[] my_array = {25, 14, 56, 15, 36,  77, 18, 29, 49};
	   
	   System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	
	   int removeIndex = 4;

	   for(int i = removeIndex; i < my_array.length -1; i++){
	        my_array[i] = my_array[i+1 ];
	      }
	    System.out.println("After removing the second element: "+Arrays.toString(my_array));
	 }
	 }



