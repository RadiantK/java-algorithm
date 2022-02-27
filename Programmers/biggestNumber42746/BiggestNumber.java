package biggestNumber42746;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        int i = 0;
        String[] temp = new String[numbers.length];
        for(int num : numbers) {
        	temp[i++] = String.valueOf(num);
        }
        
        Arrays.sort(temp, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// o2+o1, o1+o2중 더 큰 숫자를 반환 
				// ex 6, 10 일 때 610, 106 -> 610 반환
				return (o2+o1).compareTo(o1+o2);
			}
        	
        });
        
        if(temp[0].startsWith("0")) return "0";
        
        for(String tmp : temp) {
    		answer += tmp;
    	}
        return answer;
    }
}

public class BiggestNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] a = {6, 10, 2};
		
		System.out.print(s.solution(a));
	}

}
