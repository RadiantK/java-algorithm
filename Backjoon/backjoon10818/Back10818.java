package backjoon10818;

import java.util.Scanner;

public class Back10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = -99999;
		int min = 99999;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			arr[i] = a;					
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}
			if(arr[i] >= max) {
				max = arr[i];
			}		
		}
		
		System.out.print(min+" "+max);
		sc.close();
	}

}
