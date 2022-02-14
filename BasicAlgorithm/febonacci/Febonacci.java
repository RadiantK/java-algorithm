package algorithm2;

import java.util.Arrays;

public class Febonacci {

	// 피보나치 수열
	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				arr[0] = 0;
			}
			else if(i == 1) {
				arr[1] = 1;
			}
			else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.print(Arrays.toString(arr)+ " ");
		System.out.println();
		
		int[] arr2 = new int[10];
		arr2[1] = 1;
		arr2[2] = 1;
		
		for(int i = 3; i < arr2.length; i++) {
			arr2[i] = arr2[i-1] + arr2[i-2];
		}
		System.out.print(Arrays.toString(arr2)+ " ");
		
	}
}
