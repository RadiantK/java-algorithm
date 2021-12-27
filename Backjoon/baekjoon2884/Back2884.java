package baekjoon2884;

import java.util.Scanner;

public class Back2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if ((H>=0 && H<=23)&&(M>=0 && H<=59)) {
			if (M < 45) {
				H--;
				M = 60 - (45 - M);
			
				if (H < 0) {
				H = 23;
				}
				System.out.println(H + " " + M);
			} else {
				System.out.println(H + " " + (M-45));
			}	
	
		}
		sc.close();
	}

}
