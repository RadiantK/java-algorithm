package backjoon10818;

import java.util.Scanner;

public class Back10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();				
			
			if(arr[i] <= min) {
				min = arr[i];
			}
			if(arr[i] >= max) {
				max = arr[i];
			}		
		}
		
		System.out.println(min+" "+max);
		sc.close();
	}

}
