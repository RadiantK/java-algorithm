package backjoon1152;

import java.util.Scanner;

public class Back1152 {

	// 주어진 문자열을 공백을 기준으로 잘라서 단어의 갯수 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim(); // 처음과 끝 공백 제거
		sc.close();
	
		if (str.isEmpty()) {
			System.out.println(0); // 문자열이 비었을때 0 출력
		} else {
			String[] s = str.split(" "); // 공백을 기준으로 구분
			System.out.println(s.length);
		}	
	}
}