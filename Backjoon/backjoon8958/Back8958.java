package backjoon8958;

import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[sc.nextInt()];
		
		for(int i = 0; i<str.length; i++) {
			str[i] = sc.next();
		}
		
		for(int i=0; i<str.length; i++) {
			int count = 0;
			int sum = 0;
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j)=='O') {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
