package phoneNumberList42577;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++) {
        	map.put(phone_book[i], i);
        }
        
        for(int i = 0; i < phone_book.length; i++) {
        	for(int j = 0; j < phone_book[i].length(); j++) {
        		if(map.containsKey(phone_book[i].substring(0, j))) {
        			return false;
        		}
        	}
        }
        return answer;
    }
}

public class PhoneNumberList {

	public static void main(String[] args) {

		Solution s = new Solution();
		String[] str = {"119", "97674223", "1195524421"};
		
		System.out.println(s.solution(str));
		
		Map<String, Integer> list = new HashMap<>();
		
		list.put("123", 123);
	}

}
