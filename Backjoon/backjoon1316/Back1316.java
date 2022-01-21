package backjoon1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1316 {

	// �׷� �ܾ� üĿ
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
			
			// ���� ���ڿ� ���繮�ڰ� ���������� ���ǹ� ����
			if(prev != cur) {
				
				//ó�� ���ڰ� �����°��
				if(check[cur-'a'] == false) {
					check[cur -'a'] = true;
					prev = cur;
				}
				// ���ڰ� �̹� �������� �ִ� ���
				else {
					return false;
				}
			}
		}
		return true;
	}

}
