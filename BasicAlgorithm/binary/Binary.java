package algorithm4;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		sc.close();
		System.out.println(Integer.toBinaryString(input));
		
		int[] binary = new int[10];
		int mok = input;
		int index = 0;
		
		while (mok > 0) {
			binary[index] = mok % 2;
			mok = mok / 2;
			index++;
		}
		index--;

		for (; index>=0; index--) {
			System.out.print(binary[index]);
		}
	}

}
