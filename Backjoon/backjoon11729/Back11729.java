package backjoon11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back11729 {

	static int count=0;
	static StringBuilder sb = new StringBuilder();
	// �ϳ����� ����
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
		if(n==1) { // ������ 1���� ��
			sb.append(from+" "+to+"\n");
			return;
		}
		// 1 -> 3 -> 2 / 2 -> 1 -> 3 �̵�����
		hanoi(n-1, from, to, by); // n-1���� 1 -> 2�� �̵�
		sb.append(from + " " + to + "\n"); // 1���� 1 -> 3���� �̵�
		hanoi(n-1, by, from, to); // n-1���� 2 -> 3���� �̵�		
	}		
}