package backjoon2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2869 {

	// 달팽이는 올라가고 싶다.
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = 0;

		br.close();
		
		// 올라가는 길이와 높이가 같을 때 미끄러지는것을 제거하기 위해 높이에서 미끌어지는 길이를 빼줌
		day = (v - b) / (a - b); 	
		
		if(((v - b) % (a - b)) !=0 ) {
			day++;
		}
		
//		int sum = 0;
//		while(true) {
//			day++;
//			sum += a;
//			
//			if(sum < v) {
//				sum = sum-b;
//			} else {
//				break;
//			}
//		}
		
		System.out.println(day);
		
	}

}
