package backjoon1157;

import java.util.Scanner;

public class Back1157 {
	// �ܾ���� / ���帹�� ���� ���ĺ� ã��(�빮�ڷ� ���)
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
