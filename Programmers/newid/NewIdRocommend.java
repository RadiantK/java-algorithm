package newid;

class Solution {
	
	public String solution(String new_id) {
		
		// 1�ܰ� new_id�� ��� �빮�ڸ� �ҹ��ڷ� ġȯ
		new_id = new_id.toLowerCase();		
		
		// 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		
		// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ 
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		
		// 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
		if(!(new_id.isEmpty()) && new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if (!(new_id.isEmpty()) && new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		
		// 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� ����
		if(new_id.isEmpty()) {
			new_id = "a";
		}
		
		// 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
	    // ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		if (!(new_id.isEmpty()) && new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			
			if(new_id.charAt(new_id.length()-1) == '.' ) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}
		
		// 7�ܰ� new_id�� ���̰� 2�� ���϶��, ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ����
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
	
	// 1�ܰ� new_id�� ��� �빮�ڸ� �ҹ��ڷ� ġȯ
	private String toLowerCase(String new_id) {			
		new_id = new_id.toLowerCase();		
		return new_id;
	}
	// 2�ܰ� new_id���� ���ĺ� �ҹ���,����,����(-),����(_),��ħǥ(.)�� ������ ��� ���ڸ� ����
	private String exclude(String new_id) {			
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		return new_id;
	}	
	// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ 
	private String replaceDot(String new_id) {					
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		return new_id;
	}	
	// 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
	private String removeDot(String new_id) {				
		if(!(new_id.isEmpty()) && new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if (!(new_id.isEmpty()) && new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0, new_id.length()-1);
		}	
		return new_id;
	}	
	// 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� ����
	private String isEmpty(String new_id) {				
		if(new_id.isEmpty()) {
			new_id = "a";
		}	
		return new_id;
	}	
	// 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
    // ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
	private String romoveOverLength(String new_id) {				
		if (!(new_id.isEmpty()) && new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			
			if(new_id.charAt(new_id.length()-1) == '.' ) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}		
		return new_id;
	}
	// 7�ܰ� new_id�� ���̰� 2�� ���϶��, ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ����
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
