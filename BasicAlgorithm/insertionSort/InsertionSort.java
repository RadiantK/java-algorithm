package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	// 삽입 정렬.
	public static void insertion_sort(int[] a, int size) {
		
		// 타겟과(i번째) 이전 요소와 비교해서 작으면 위치를 바꿔줌
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
