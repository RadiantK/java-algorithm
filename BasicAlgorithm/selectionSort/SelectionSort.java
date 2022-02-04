package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}

	private static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size -1; i++) {
			int min_idx = i;
			
			for(int j = i+1; j < size; j++) {
				if(a[j] < a[min_idx]) {
					min_idx = j;
				}
			}
			swap(a, min_idx, i);
		}	
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {

		int[] a = {84, 54, 18, 99, 64, 77, 100, 50, 40};
		selection_sort(a);
		
		System.out.println(Arrays.toString(a));
	}

	
}
