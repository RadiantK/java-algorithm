package numberStringtoEng81301;

class Solution {
    public int solution(String s) {   
    	
    	String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
    	String[] str = 
    		{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	
    	for(int i = 0; i < str.length; i++) {
    		s = s.replace(str[i], nums[i]);
    	}
    	
        return Integer.parseInt(s);
    }
}

class Solution2 {
    public int solution(String s) {   
    	
    	String[] str = 
    		{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	
    	for(int i = 0; i < str.length; i++) {
    		s = s.replace(str[i], String.valueOf(i));
    	}
    	
        return Integer.parseInt(s);
    }
}

public class NumberStringToEnglish {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		System.out.println(s.solution("one4seveneight"));
	}

}
