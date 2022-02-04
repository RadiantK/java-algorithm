package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	public static void insertion_sort(int[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			
			int target = a[i];
			
			int j = i-1;
			while(j >= 0 && target < a[j]) {
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = target;
		}
	}
	
	public static void main(String[] args) {

		int[] a = {80, 50, 70, 10, 60, 90, 20, 40, 30};
		insertion_sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
