package backjoon2941;

import java.util.Scanner;

public class Back2941_2 {

	// 크로아티아 알파벳 다른방법 풀이
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			// 찾은 알파벳의 다음 글자가 문자열 범위를 넘어가는 것을 방지
			if(ch == 'c' && i < str.length()-1) {				
				//찾은 글자가 맞으면 i+1까지 한문자이므로 다음으로 넘어감 i++
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
					i++;				
				}
			}
			else if (ch == 'd' && i < str.length()-1) { 
				
				if(str.charAt(i+1) == '-') {
					i++;
				}
				else if (str.charAt(i+1) == 'z' && i < str.length()-2) {
					if(str.charAt(i+2) == '=') {
						i= i+2;
					}
				}
			}
			else if((ch == 'l' || ch == 'n') && i < str.length()-1) {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			else if((ch == 's' || ch == 'z') && i < str.length() -1) {
				if (str.charAt(i+1) == '=') {
					i++;
				}
			}
			count++;
 		}
		System.out.println(count);
	}

}
