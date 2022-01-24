package backjoon3009;

import java.util.Scanner;

public class Back3009 {

	// 네 번째 점 찾기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] dot_1 = {sc.nextInt(), sc.nextInt()};
		int[] dot_2 = {sc.nextInt(), sc.nextInt()};
		int[] dot_3 = {sc.nextInt(), sc.nextInt()};
		sc.close();
		
		int x = 0;
		int y = 0;
		// x
		if(dot_1[0] == dot_2[0]) {
			x = dot_3[0];
		} 
		else if(dot_1[0] == dot_3[0]) {
			x = dot_2[0];
		}
		else {
			x = dot_1[0];
		}
		
		// y
		if(dot_1[1] == dot_2[1]) {
			y = dot_3[1];
		} 
		else if(dot_1[1] == dot_3[1]) {
			y = dot_2[1];
		}
		else {
			y = dot_1[1];
		}
		System.out.println(x + " " + y);
	}

}
