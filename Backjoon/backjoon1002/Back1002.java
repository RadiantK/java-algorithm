package backjoon1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1002 {

	// (터렛) 두 원의 위치 관계
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < t; i++) {
					
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double dis = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
			
			// 중점이 같으면서 반지름도 같은 경우 (무한대)
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				result = -1;
			}
			// 한 점에서 만날 경우
			else if (dis == r1 + r2 || dis == Math.abs(r1 - r2)) {
				result = 1;
			}
			// 만나지 않을 경우
			else if (dis > r1 + r2 || dis < Math.abs(r1-  r2) || dis == 0) {
				result = 0;
			}
			// 두점에서 만날 경우
			else {
				result = 2;
			}
			System.out.println(result);
		}
	}
}
