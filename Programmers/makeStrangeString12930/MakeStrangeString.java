package makeStrangeString12930;

class Solution {
    public String solution(String s) {
        String answer = "";
        // ��� ���ڸ� �Ѵܾ �ɰ��� �迭�� ����
        String[] temp = s.split("");
        
        int cnt = 0;
        for(int i = 0; i < temp.length; i++) {
        	// �����̸� ī��Ʈ�� 0���� �ʱ�ȭ
        	if(temp[i].equals(" ")) cnt = 0;
        	// Ȧ����°�� �빮�ڷ� ����
        	else if(cnt % 2 == 0) {
        		temp[i] = temp[i].toUpperCase();
        		cnt++;
        	}
        	// ¦����°�� �ҹ��ڷ� ����
        	else if(cnt % 2 != 0) {
        		temp[i] = temp[i].toLowerCase();
        		cnt++;
        	}
        	// ������ ���ڸ� ���ڿ��� ��ħ
        	answer += temp[i];
        }
        return answer;
    }
}

public class MakeStrangeString {

	public static void main(String[] args) {

		Solution s = new Solution();
		String str = "try hello world";
		System.out.println(s.solution(str));
		
		System.out.print((char)('A'+ 1));
	}

}
