package backjoon3053;

import java.util.Scanner;

public class Back3053 {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble(); // 반지름 입력
		sc.close();
		
		double area_1 = r * r * Math.PI; // 유클리드 원의 넓이
		double area_2 = 2 * r * r; // 택시 기하학 원의 넓이
		
		System.out.println(area_1 + "\n" + area_2);
	}
}
