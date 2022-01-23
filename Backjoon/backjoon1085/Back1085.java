package backjoon1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1085 {
	// 직사각형 탈출
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		br.close();
		
		int distance = 999;
		if(x < distance) {
			distance = x;
		}
		if(y < distance) {
			distance = y;
		}
		if(w - x < distance) {
			distance = w - x;
		}
		if(h - y < distance) {
			distance = h - y;
		}
		System.out.println(distance);
		
//		System.out.print(Math.min(Math.min(w-x, x),Math.min(h-y, y)));
	}

}
