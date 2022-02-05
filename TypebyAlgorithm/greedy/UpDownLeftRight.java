package greedy;

import java.util.Scanner;

public class UpDownLeftRight {

	static int[] _x = {-1,1,0,0};
	static int[] _y = {0,0,-1,1};
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int x = 0, y = 0;
		char[] move = {'U', 'D', 'L', 'R'};
		
		String[] plans = sc.nextLine().split(" ");
		sc.close();
		
		for(int i = 0; i < plans.length; i++) {
			char ch = plans[i].charAt(0);
			
			int nx = 0; 
			int ny = 0;
			for(int j = 0; j < 4; j++) {
				if(ch == move[j]) {
					nx = x + _x[j];
					ny = y + _y[j];
				}

			}
			if(nx < 0 || nx > n || ny < 0 || ny > n) continue;
			x = nx;
			y = ny;
		}
		
		System.out.println(x + " " + y);
	}

}
