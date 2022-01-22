package backjoon2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2869 {

	// �����̴� �ö󰡰� �ʹ�.
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = 0;

		br.close();
		
		// �ö󰡴� ���̿� ���̰� ���� �� �̲������°��� �����ϱ� ���� ���̿��� �̲������� ���̸� ����
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
