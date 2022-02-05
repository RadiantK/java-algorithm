package shellSort;

import java.util.Arrays;

public class ShellSort {
	
	// 갭을 담고있는 배열
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};
	
	private static int getGap(int length) {
		int index = 0;
		// 최소한 부분 배열의 원소가 2개씩은 비교되도록 나눠줌
		int len = (int)(length / 2.25);
		
		while(gap[index] < len) {
			index++;
		}
		return index;
	}
	public static void shellSort(int[] a) {
		int size = a.length;
		int index = getGap(size);
		
		// gap[index]값부터 gap[0]까지 반복
		for(int i = index; i >= 0; i--) {
			
			//각 부분의 리스트에 대해서 삽입정렬 진행
			for(int j = 0; j < gap[i]; j++) {
				insertion_sort(a, j, size, gap[i]);
			}
		}
	}
	
	public static void insertion_sort(int[] a, int start, int size, int gap) {
		
		// 부분 배열의 두 번째 원소부터 size까지 반복 (gap 값씩 건너띔) 
		for(int i = start + gap; i < size; i += gap) {
			
			int target = a[i];
			int j = i - gap;
			
			// 타겟이 이전값보다 작을 때 까지 반복
			while(j >= start && target < a[j]) {
				// 이전 원소를 한 칸씩 뒤로 미룸
				a[j + gap] = a[j];
				j -= gap;
			}
			a[j + gap] = target;
		}
	}

	public static void main(String[] args) {

		int[] a = {80, 50, 70, 10, 60, 90, 20, 40, 30};
		shellSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
