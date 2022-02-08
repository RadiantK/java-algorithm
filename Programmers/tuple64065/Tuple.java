package tuple64065;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length()-2).replace("},{", "-").trim();
		String[] str = s.split("-");
		int[] answer = new int[str.length];
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		int i = 0;
		List<Integer> list = new ArrayList<>();
		for(String ss : str) {
			String[] temp = ss.split(",");
			for(String tmp : temp) {
				int a = Integer.parseInt(tmp);
				if(!list.contains(a)) {
					list.add(a);
					answer[i++] = a;
				}
			}
		}
        return answer;
    }
}

public class Tuple {

	public static void main(String[] args) {

		Solution s = new Solution();
		String str = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
		
		System.out.println(Arrays.toString(s.solution(str)));		
	}

}
