package year2016_12901;

import java.text.SimpleDateFormat;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
    	Calendar cal = Calendar.getInstance();

		cal.set(2016, a-1, b); // 2016�� a�� b��
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
        
        // a������ -1�� �� �ϼ��� ������
        for(int i = 0; i < a-1; i++) {
        	total += date[i];
        }
        // 1��1�Ϻ��� a�� b�ϱ����� �� �ϼ��� ���� ���� 
        total += b-1;
        // ������Ϲ迭�� ���� �ε������� ����
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
