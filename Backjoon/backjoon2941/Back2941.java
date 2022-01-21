package backjoon2941;

import java.util.Scanner;

public class Back2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<str.length; i++) {
			if(s.contains(str[i])) {
				s = s.replaceAll(str[i], " ");
			}
		}
		System.out.println(s.length());
		sc.close();
	}
}
