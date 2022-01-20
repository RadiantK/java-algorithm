package backjoon4344;

import java.util.Scanner;

public class Back4344_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int X = sc.nextInt();
			arr = new int[X];
			
			double sum = 0;
			double avg = 0;
			
			for(int j=0; j< X; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			avg = (sum / X);
			double count = 0;
			for(int k = 0; k < X; k++) {
				if(arr[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", (count/ X)*100);
			System.out.println("%");
		}
		sc.close();
	}

}
