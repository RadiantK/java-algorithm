package newsclustering17677;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
    	List<String> list1 = new ArrayList<>();
    	List<String> list2 = new ArrayList<>();
    	List<String> kyo = new ArrayList<>();
    	List<String> hab = new ArrayList<>();
    	
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();
    	
    	// str1�� �������� : �ձ��ڿ� �ޱ��ڰ� �����϶��� �������
    	for(int i = 0; i < str1.length()-1; i++) {
    		char a = str1.charAt(i);
    		char b = str1.charAt(i+1);
    		
    		if(a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
    			list1.add(a + "" + b);
    		}
    	}
    	// str2�� �������� : �ձ��ڿ� �ޱ��ڰ� �����϶��� �������
    	for(int i = 0; i < str2.length()-1; i++) {
    		char a = str2.charAt(i);
    		char b = str2.charAt(i+1);
    		
    		if(Character.isLetter(a) && Character.isLetter(b)) {
    			list2.add(a + "" + b);
    		}
    	}
    	
    	// ������ �������� ����� ���� ����
    	Collections.sort(list1);
    	Collections.sort(list2);
    	System.out.println(list1);
    	System.out.println(list2);
    	
    	// ������
    	for(String s : list1) {
    		// ����1�� ���ڰ� 2�� ���ԵǾ������� ����
    		if(list2.remove(s)) {
    			kyo.add(s);
    		}
    		// ���Ե��� ���� ���ڸ� �����տ� �߰�
    		hab.add(s);
    	}
    	System.out.println(kyo);
    	System.out.println(hab);
    	
    	// ������
    	for(String s : list2) {
    		// �����տ��� ���ܵ� ���� �����տ� �߰�
    		hab.add(s);
    	}
    	System.out.println(kyo);
    	System.out.println(hab);
    	
    	//��ī�� ���絵 ���ϱ�
    	double kyoSize = kyo.size();
    	double habSize = hab.size();
    	double jakard = 0;
    	// �������� ��� 1
    	if(habSize == 0) {
    		jakard = 1;
    	} else {
    		jakard = kyoSize / habSize;
    	}
        int answer = (int)(jakard * 65536);
        return answer;
    }
}

public class NewsClustering {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		String str1 = "FRANCE";
		String str2 = "french";
		
		System.out.println(s.solution(str1, str2));
		System.out.println(4 | 1);
	}

}