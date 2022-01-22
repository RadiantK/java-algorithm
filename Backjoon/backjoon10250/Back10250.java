package backjoon10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10250 {

	// 방번호 찾기(ACM호텔)
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // 호텔층수
			int W = Integer.parseInt(st.nextToken()); // 각 층별 방 수(안쓰임)
			int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님
			int Y = 0; // 층 구분
			int X = 0; // 호 수 구분
			
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
