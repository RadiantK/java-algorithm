package backjoon10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10250 {

	// ���ȣ ã��(ACMȣ��)
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // ȣ������
			int W = Integer.parseInt(st.nextToken()); // �� ���� �� ��(�Ⱦ���)
			int N = Integer.parseInt(st.nextToken()); // �� ��° �մ�
			int Y = 0; // �� ����
			int X = 0; // ȣ �� ����
			
			if( N % H == 0) {
				Y = H * 100;
				X = (N / H);
				System.out.println(Y+X);
			} else {
				Y = (N % H) * 100;
				X = N / H + 1;
				System.out.println(Y+X);
			}
			
		}
		br.close();
	}

}
