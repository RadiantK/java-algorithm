package algorithm3;

import java.util.Scanner;

public class LotOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		
		int[] save = new int[10];
		
		for(int i=0; i<10; i++) {
			save[num[i]]++;
		}
		
		int number = 0;
		int count = 0;
		for(int i = 0; i < 10; i++) {
			if(count < save[i]) {
				count = save[i];
				number = i;
			}
		}
		System.out.println("number : "+ number + ", count : " + count);
		sc.close();
	}

}
