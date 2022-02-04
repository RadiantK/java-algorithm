package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		int size = a.length;
		
		// 배열의 크기 -1만큼 반복문 진행
		for(int i = 1; i < size; i++) {
			
			boolean swapped= false;
			// 각 라운드별 비교 횟수는 배열 크기의 현재라운드를 뺀 만큼 비교
			for(int j = 0; j < size-i; j++) {
				
				// 앞의 인덱스가 다음인덱스보다 크면 바꿈
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					swapped = true;
				}
			}
			// 스왑된적이 없다면 이미 정렬 됬다는 의미이므로 반복문 종료
			if(swapped == false) {
				break;
			}
		}
	}
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {

		int[] a = {80, 50, 70, 10, 60, 90, 20, 40, 30};
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
	}
}