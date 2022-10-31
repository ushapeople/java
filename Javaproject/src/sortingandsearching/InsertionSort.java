package sortingandsearching;

public class InsertionSort {
public static void insertionSort(int array[]) {
	int n=array.length;
	for(int j=1;j<n;j++) {
		int key=array[j];
		int i=j-1;
		while((i>-1) && (array[i]>key)) {
			array[i+1]=array[i];
			i--;
		}
		array[i+1]=key;
	}
}
public static void main(String[] args) {
	int[] arr1= {9,14,3,7,86,54};
	System.out.println("Before insertion sort");
	for(int i:arr1) {
		System.out.print(i+" ");
	}
	System.out.println();
	insertionSort(arr1);//sorting array using insertion sort
System.out.println("After insertion sort");
for(int i:arr1) {
	System.out.print(i+" ");
}
}
}
