package country124;

class Solution {
    public String solution(int n) {
    	StringBuilder sb = new StringBuilder();
    	// 1,2,4�θ� ���� ǥ��
    	while(n != 0) {
    		/// 3���� ���� ������
    		int rules = n % 3;
    		
    		if(rules == 0) {
    			sb.append(4);
    		} else if (rules == 1) {
    			sb.append(1);
    		} else if (rules == 2) {
    			sb.append(2);
    		}
    		// 0���� ������ �������� n���� �ϳ� ����
    		if(rules == 0) {
    			n--;
    		}
    		n = n/3;
    	}
        return sb.reverse().toString();
    }
}

public class Country124 {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(10));
	}

}
