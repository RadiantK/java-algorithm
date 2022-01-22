package backjoon8958;

import java.util.Scanner;

public class Back8958_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next();
			int count = 0;
			int sum = 0;
			for(int j=0; j < str[i].length(); j++) {
				
				if(str[i].charAt(j) == 'O' ) {
					count++;
					sum += count;
				} else {
					count = 0;
				}
				
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
