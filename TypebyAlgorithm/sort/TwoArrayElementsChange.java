package sort;

import java.util.*;

public class TwoArrayElementsChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 배열의 길이
		int k = sc.nextInt(); // K번 바꿔치기함
		
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		// a의 요소를 입력받음
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		// b의 요소를 입력받음
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i = 0; i < k; i++) {
			if(a[i] < b[i]) {
				int temp = a[i];
				a[i] = b[i];
				b[i] = temp;
			} else { // A >= B 이면 반복문 탈출
				break;
			}
		}
		
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i]; // 바꾼 a배열의 합
		}
		System.out.println(result);
	}
}
