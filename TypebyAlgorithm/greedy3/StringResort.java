package greedy3;

import java.util.*;

public class StringResort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		
		String s = sc.nextLine();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				list.add(s.charAt(i));
			} else {
				sum += s.charAt(i) - '0';
			}
		}
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		if(sum != 0) System.out.print(sum);
	}

}
