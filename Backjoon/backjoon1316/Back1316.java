package backjoon1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1316 {

	// 그룹 단어 체커
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(check(br.readLine()) == true) {
				count++;
			}
		}
		System.out.println(count);
		br.close();
		
	}
	public static boolean check(String str) {
		boolean[] check = new boolean[26];
		int prev = 0;
		int cur = 0;
		
		for(int i=0; i<str.length(); i++) {
			cur = str.charAt(i);
			
			// 앞의 문자와 현재문자가 같지않으면 조건문 실행
			if(prev != cur) {
				
				//처음 문자가 나오는경우
				if(check[cur-'a'] == false) {
					check[cur -'a'] = true;
					prev = cur;
				}
				// 문자가 이미 나온적이 있는 경우
				else {
					return false;
				}
			}
		}
		return true;
	}

}
