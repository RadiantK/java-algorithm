package year2016_12901;

import java.text.SimpleDateFormat;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
    	Calendar cal = Calendar.getInstance();

		cal.set(2016, a-1, b); // 2016년 a월 b일
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
		
		return sdf.format(date).toUpperCase();
    }
}

class Solution2 {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        
        // a월에서 -1을 뺀 일수를 더해줌
        for(int i = 0; i < a-1; i++) {
        	total += date[i];
        }
        // 1월1일부터 a월 b일까지의 총 일수의 합을 구함 
        total += b-1;
        // 영어요일배열로 나눈 인덱스값을 받음
        answer = day[total % 7];
        
        return answer;
    }
}

public class Year2016 {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		Solution2 s2 = new Solution2();
		
		int a = 5;
		int b = 24;
		System.out.println(s.solution(a, b));
		System.out.println(s2.solution(a, b));
	
	}

}
