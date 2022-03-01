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
    	
    	// str1의 다중집합 : 앞글자와 뒷글자가 문자일때만 만들어짐
    	for(int i = 0; i < str1.length()-1; i++) {
    		char a = str1.charAt(i);
    		char b = str1.charAt(i+1);
    		
    		if(a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
    			list1.add(a + "" + b);
    		}
    	}
    	// str2의 다중집합 : 앞글자와 뒷글자가 문자일때만 만들어짐
    	for(int i = 0; i < str2.length()-1; i++) {
    		char a = str2.charAt(i);
    		char b = str2.charAt(i+1);
    		
    		if(Character.isLetter(a) && Character.isLetter(b)) {
    			list2.add(a + "" + b);
    		}
    	}
    	
    	// 차집합 교집합을 만들기 위해 정렬
    	Collections.sort(list1);
    	Collections.sort(list2);
    	System.out.println(list1);
    	System.out.println(list2);
    	
    	// 교집합
    	for(String s : list1) {
    		// 집합1의 문자가 2에 포함되어있으면 제거
    		if(list2.remove(s)) {
    			kyo.add(s);
    		}
    		// 포함되지 않은 문자를 합집합에 추가
    		hab.add(s);
    	}
    	System.out.println(kyo);
    	System.out.println(hab);
    	
    	// 합집합
    	for(String s : list2) {
    		// 교집합에서 제외된 문자 합집합에 추가
    		hab.add(s);
    	}
    	System.out.println(kyo);
    	System.out.println(hab);
    	
    	//자카드 유사도 구하기
    	double kyoSize = kyo.size();
    	double habSize = hab.size();
    	double jakard = 0;
    	// 공집합일 경우 1
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