package backjoon1157;

import java.util.Scanner;

public class Back1157 {
	// 단어공부 / 가장많이 사용된 알파벳 찾기(대문자로 출력)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String str = sc.nextLine().toUpperCase();
		int max = -1;
		char ch = ' ';
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'A']++;
			
			if(max < arr[str.charAt(i)-'A']) {
				max = arr[str.charAt(i)-'A'];
				ch = str.charAt(i);
			} else if(max == arr[str.charAt(i)-'A']) {
				ch = '?';
			}
		}
		System.out.println(ch);
		sc.close();

	}
}
