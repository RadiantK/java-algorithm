package backjoon11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back11729 {

	static int count=0;
	static StringBuilder sb = new StringBuilder();
	// 하노이의 원판
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		hanoi(n, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);	
	}
	
	static void hanoi(int n, int from, int by, int to) {
		count++;
		if(n==1) { // 원판이 1개일 때
			sb.append(from+" "+to+"\n");
			return;
		}
		// 1 -> 3 -> 2 / 2 -> 1 -> 3 이동순서
		hanoi(n-1, from, to, by); // n-1개를 1 -> 2로 이동
		sb.append(from + " " + to + "\n"); // 1개를 1 -> 3으로 이동
		hanoi(n-1, by, from, to); // n-1개를 2 -> 3으로 이동		
	}		
}