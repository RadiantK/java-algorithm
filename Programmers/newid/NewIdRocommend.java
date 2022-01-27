package newid;

class Solution {
	
	public String solution(String new_id) {
		
		// 1단계 new_id의 모든 대문자를 소문자로 치환
		new_id = new_id.toLowerCase();		
		
		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		
		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환 
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		
		// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
		if(!(new_id.isEmpty()) && new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if (!(new_id.isEmpty()) && new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		
		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입
		if(new_id.isEmpty()) {
			new_id = "a";
		}
		
		// 6단계 new_id의 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
	    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if (!(new_id.isEmpty()) && new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			
			if(new_id.charAt(new_id.length()-1) == '.' ) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}
		
		// 7단계 new_id의 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
		if(!(new_id.isEmpty()) && new_id.length() <= 2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}		
		}
		
		String answer = new_id;
		return answer;
	}
}

class Solution2 {
	
	public String solution(String new_id) {
		
		new_id = toLowerCase(new_id);
		new_id = exclude(new_id);
		new_id = replaceDot(new_id);
		new_id = removeDot(new_id);
		new_id = isEmpty(new_id);
		new_id = romoveOverLength(new_id);
		new_id = appendText(new_id);
		
		String answer = new_id;
		return answer;
	}
	
	// 1단계 new_id의 모든 대문자를 소문자로 치환
	private String toLowerCase(String new_id) {			
		new_id = new_id.toLowerCase();		
		return new_id;
	}
	// 2단계 new_id에서 알파벳 소문자,숫자,빼기(-),밑줄(_),마침표(.)를 제외한 모든 문자를 제거
	private String exclude(String new_id) {			
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		return new_id;
	}	
	// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환 
	private String replaceDot(String new_id) {					
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		return new_id;
	}	
	// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
	private String removeDot(String new_id) {				
		if(!(new_id.isEmpty()) && new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if (!(new_id.isEmpty()) && new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0, new_id.length()-1);
		}	
		return new_id;
	}	
	// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입
	private String isEmpty(String new_id) {				
		if(new_id.isEmpty()) {
			new_id = "a";
		}	
		return new_id;
	}	
	// 6단계 new_id의 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	private String romoveOverLength(String new_id) {				
		if (!(new_id.isEmpty()) && new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			
			if(new_id.charAt(new_id.length()-1) == '.' ) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}		
		return new_id;
	}
	// 7단계 new_id의 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
	private String appendText(String new_id) {					
		if(!(new_id.isEmpty()) && new_id.length() <= 2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}		
		}	
		return new_id;
	}
	
} 

public class NewIdRocommend {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		System.out.println(sol.solution("...!@BaT#*..y.abcdefgh.jklm."));
		System.out.println(sol.solution("=.="));
	}

}
