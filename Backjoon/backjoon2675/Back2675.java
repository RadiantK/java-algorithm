package backjoon2675;

import java.util.Scanner;

public class Back2675 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i =0; i < a; i++) {
			int n = sc.nextInt(); // 문자 반복횟수
			String str = sc.next(); // 문자입력
			
			for(int j=0; j<str.length(); j++) {
				
				for(int k=0; k < n; k++) {
					System.out.print(str.charAt(j)); // j값을 n만큼 반복
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
