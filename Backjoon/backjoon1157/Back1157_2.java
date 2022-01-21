package backjoon1157;

import java.util.Scanner;

public class Back1157_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++ ) {
			if('A' <= str.charAt(i) && str.charAt(i)<='Z') {
				arr[str.charAt(i)-'A']++; // �빮���� ��� �ش� �ε��� �� 1 �߰�
			}
			else {
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		int max= -1;
		char ch = ' ';
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+'A'); // �빮�ڷ� ���
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		sc.close();
	}

}