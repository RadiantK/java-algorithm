package openChat;

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
    	
    	Map<String, String> userMap = new HashMap<>();
    	List<String> result = new ArrayList<>();
    	
    	// �Է¹��� ���ڿ��� ������ �����ؼ� ���� �迭
    	String[] str;
    	for(int i = 0; i < record.length; i++) {
    		// ������ �������� �迭�� ����
    		str = record[i].split(" ");
    		if(str.length > 2) {
    			// [0]��°�� ������ �������� �ʰ�ü�� ����
    			userMap.put(str[1], str[2]);
    		}
    	}
    	
    	for(int i = 0; i < record.length; i++) {
    		str = record[i].split(" ");
    		if(str[0].equals("Leave")) {
    			// �ʰ�ü�� ��� Ű���� ��ġ�ϴ� valuse(�г���)�� �ҷ���
    			result.add(userMap.get(str[1])+"���� �������ϴ�.");
    		} else if(str[0].equals("Enter")) {
    			result.add(userMap.get(str[1])+"���� ���Խ��ϴ�.");
    		} else {
    			continue;
    		}
    	}
    	
    	String[] answer = result.toArray(new String[result.size()]);
//    	int size = 0;
//    	for(String temp : result) {
//    		answer[size++] = temp;
//    	}
        return answer;
    }
}

class Solution2 {
	
	@SuppressWarnings("unused")
	private class User {
		public String userId;	
		public String nickName;
		
		public User(String userId, String nickName) {
			this.userId = userId;
			this.nickName = nickName;
		}
	}
	
    public String[] solution(String[] record) {
        
    	Map<String, User> userMap = new HashMap<>();
    	
    	String[] str;
    	for(int i = 0; i < record.length; i++) {
    		str = record[i].split(" ");
    		if(str.length > 2) {
    			userMap.put(str[0], new User(str[1], str[2]));
    		}
    	}
    	    	
    	List<String> result = new ArrayList<>();
    	
    	for(int i = 0; i < record.length; i++) {
    		str = record[i].split(" ");
    		if(str[0].charAt(0) == 'L') {
    			result.add(userMap.get(str[1])+"���� �������ϴ�.");
    		} else if(str[0].charAt(0) == 'C') {
    			continue;
    		} else {
    			result.add(userMap.get(str[1])+"���� ���Խ��ϴ�.");
    		}
    	}
    	
    	
    	String[] answer = new String[result.size()];
    	int size = 0;
    	for(String temp : result) {
    		answer[size++] = temp;
    	}
    	
        return answer;
    }
}

public class OpenChat {

	public static void main(String[] args) {
		
		String[] record = new String[5] ;
			
		record[0] = "Enter uid1234 Muzi";
		record[1] = "Enter uid4567 Prodo";
		record[2] = "Leave uid1234";
		record[3] = "Enter uid1234 Prodo";
		record[4] = "Change uid4567 Ryan";
		
		System.out.println(Arrays.toString(record));
		
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(record)));
		
	}
	
	

}
