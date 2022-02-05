package sort;

import java.util.*;

public class TwoArrayElementsChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // �迭�� ����
		int k = sc.nextInt(); // K�� �ٲ�ġ����
		
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		// a�� ��Ҹ� �Է¹���
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		// b�� ��Ҹ� �Է¹���
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
			} else { // A >= B �̸� �ݺ��� Ż��
				break;
			}
		}
		
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i]; // �ٲ� a�迭�� ��
		}
		System.out.println(result);
	}
}
