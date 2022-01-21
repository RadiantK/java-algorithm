package back2292;

import java.util.Scanner;

public class Back2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int count = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.println(1);
		} 
		else {		
			while(range <= n) {
				range = range + (6 * count);
				count++;
			}	
		}	
		System.out.println(count);
	}

}
