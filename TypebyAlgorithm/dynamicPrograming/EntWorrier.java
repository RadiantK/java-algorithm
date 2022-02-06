package dynamicPrograming;

import java.util.Scanner;

public class EntWorrier {

	static int[] res = new int[100];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		res[0] = a[0];
		res[1] = Math.max(a[0], a[1]);
		
		for(int i = 2; i < n; i++) {
			res[i] = Math.max(res[i-1], res[i-2] + a[i]);
//			res[i] = res[i-1] > (res[i-2] + a[i]) ? res[i-1] : (res[i-2] + a[i]);
		}
		
		System.out.println(res[n-1]);
	}

}
