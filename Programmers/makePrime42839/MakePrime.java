package makePrime42839;

import java.util.*;

class Solution {
	
//	Set<Integer> set = new HashSet<>();
	List<Integer> set = new ArrayList<>();
    public int solution(String numbers) {
        int answer = 0;
        dfs("", numbers);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
        	int num = it.next();
        	if(isPrime(num)) {
        		answer++;
        	}	
        }
        return answer;
    }
    // 수의 조합 찾기
    void dfs(String temp, String num) {
    	
    	if(!temp.equals("") && !set.contains(Integer.valueOf(temp))){
    		System.out.println(temp);
    		set.add(Integer.valueOf(temp));
    	}
    	for(int i = 0; i < num.length(); i++) {
    		dfs(temp + num.charAt(i), num.substring(0, i) + num.substring(i+1));
    	}
    }
    // 소수 확인
    boolean isPrime(int num) {
    	if(num <= 1) return false;
    	
    	for(int i = 2; i <= Math.sqrt(num); i++){
    		if(num % i == 0){
    			return false;
    		}
    	}
    	return true;
    }   
}

class Solution2 {
	
	Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        dfs("", numbers);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
        	int num = it.next();
        	if(isPrime(num)) {
        		answer++;
        	}	
        }
        return answer;
    }
    // 수의 조합 찾기
    void dfs(String temp, String num) {
    	
    	if(!temp.equals("")){
    		set.add(Integer.valueOf(temp));
    	}
    	for(int i = 0; i < num.length(); i++) {
    		dfs(temp + num.charAt(i), num.substring(0, i) + num.substring(i+1));
    	}
    }
    // 소수 확인
    boolean isPrime(int num) {
    	if(num <= 1) return false;
    	
    	for(int i = 2; i <= Math.sqrt(num); i++){
    		if(num % i == 0){
    			return false;
    		}
    	}
    	return true;
    }   
}

public class MakePrime {

	public static void main(String[] args) {

		Solution s = new Solution();
		String st = "6542";
		System.out.println(s.solution(st));
	}

}
