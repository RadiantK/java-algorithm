package backjoon4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back4153 {

	// 직각삼각형 증명하기
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if( a == 0 && b == 0 && c == 0 ) {
				break;
			}
			
			// 세변의 길이마다 피타고라스 증명
			if((a * a) == ((b * b)+(c * c))) {
				System.out.println("right");
			}
			else if((b * b) == ((a * a)+(c * c))) {
				System.out.println("right");
			} 
			else if((c * c) == ((a * a)+(b * b))) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		br.close();
	}

}
