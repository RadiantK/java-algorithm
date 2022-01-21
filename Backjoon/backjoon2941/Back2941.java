package backjoon2941;

import java.util.Scanner;

public class Back2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<str.length; i++) {
			if(s.contains(str[i])) { // str[i]번째 문자가 포함되어있으면 조건문 실행
				s = s.replaceAll(str[i], " "); // [str[i]문자를 공백으로 변경
			}
		}
		System.out.println(s.length());
		sc.close();
	}
}
