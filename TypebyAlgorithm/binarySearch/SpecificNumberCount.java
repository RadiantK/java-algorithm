package binarySearch;

import java.util.*;

// ���ĵ� �迭���� Ư�� ���� ���� ���ϱ�
public class SpecificNumberCount {

	private static int countByRange(int[] arr, int leftValue, int rightValue) {
		// Ư�� ���� �� �ε���
		int rightIndex = upperBound(arr, rightValue, 0, arr.length);
		// Ư�� ���� ù ��° �ε���
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
		
		int n = sc.nextInt(); // �������� ����
		int k = sc.nextInt(); // ã�� ���� ��
		
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
