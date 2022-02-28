package binarySearch;

import java.util.*;

// 정렬된 배열에서 특정 수의 개수 구하기
public class SpecificNumberCount {

	private static int countByRange(int[] arr, int leftValue, int rightValue) {
		// 특정 수의 끝 인덱스
		int rightIndex = upperBound(arr, rightValue, 0, arr.length);
		// 특정 수의 첫 번째 인덱스
		int leftIndex = lowerBound(arr, rightValue, 0, arr.length);
		return rightIndex - leftIndex;
	}
	
	private static int upperBound(int[] arr, int target, int start, int end) {
		while(start < end) {
			int mid = (start + end) / 2;
			if(arr[mid] > target) {
				end = mid;
			} else {
				start = mid +1;
			}
		}
		return end;
	}

	private static int lowerBound(int[] arr, int target, int start, int end) {
		while(start < end) {
			int mid = (start + end) /2;
			if(arr[mid] >= target) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 데이터의 개수
		int k = sc.nextInt(); // 찾고 싶은 값
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int count = countByRange(arr, k, k);
		
		if(count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}
}
