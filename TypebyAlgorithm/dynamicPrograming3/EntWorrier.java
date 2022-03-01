package dynamicPrograming3;

import java.util.*;

class Solution {
	List<Integer> list = new ArrayList<>();
	
	public int solution(String numbers) {
		int answer = 0;
		dfs("", numbers);
		for(int i = 0; i < list.size(); i++) {
			if(isPrime(list.get(i))) {
				answer++;
			}
		}
        return answer;
    }
	
	boolean isPrime(int num) {
		if(num <= 1 ) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	void dfs(String temp, String num) {
		if(!temp.equals("") && !list.contains(Integer.valueOf(temp))) {
			list.add(Integer.valueOf(temp));
		}
		for(int i = 0; i < num.length(); i++) {
			dfs(temp + num.charAt(i), num.substring(0, i) + num.substring(i+1));
		}
	}
}

public class EntWorrier {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String st = "011";
		System.out.println(s.solution(st));
	}

}
