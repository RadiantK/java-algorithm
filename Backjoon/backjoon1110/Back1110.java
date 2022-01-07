package backjoon1110;

import java.util.Scanner;

public class Back1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int copy = n;
		int count=0;
		sc.close();
		while(true) {
			count++;
			n = ((n%10)*10)+(((n/10)+(n%10))%10);
			
			if(copy == n) {
				break;
			}
		}
		System.out.println(count);
		
	}
}
