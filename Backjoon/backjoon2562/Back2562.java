package backjoon2562;

import java.util.Scanner;

public class Back2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] arr = new int[n];
		int maxpos = 0;
		int max = 0;
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt(); 
			arr[i] = input;
		}
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxpos = i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxpos);
		sc.close();
	}

}
