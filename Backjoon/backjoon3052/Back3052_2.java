package backjoon3052;

import java.util.Scanner;

public class Back3052_2 {

	// 42�� �������� �� �ߺ����� �ʴ� ������ ��
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		HashSet<Integer> set = new HashSet<>();
//		
//		for(int i = 0; i < 10; i++) {
//			set.add(sc.nextInt() % 42);
//		}
//		System.out.print(set.size());
//		sc.close();
		
		boolean[] arr = new boolean[42];
		
		for(int i=0; i<10; i++) {
			arr[sc.nextInt() % 42]  = true;
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == true) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
