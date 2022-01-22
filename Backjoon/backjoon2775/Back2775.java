package backjoon2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2775 {

	// �γ�ȸ���� �� �׾�
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		
		for(int i = 0; i<arr.length; i++) {
			arr[0][i] = i; // 0�� iȣ���� �ʱⰪ ���� 0~14
			arr[i][1] = 1; // i�� 1ȣ �� 1�� ���� (0ȣ�� ��� ����)
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 2; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine()); // ����
			int n = Integer.parseInt(br.readLine()); // ȣ��
			
			System.out.println(arr[k][n]);
		}
		br.close();
	}

}

