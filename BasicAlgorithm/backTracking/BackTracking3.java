package backTracking;

import java.util.*;

public class BackTracking3 {
	static boolean[] visited;
	static List<String> list;
	
	public static void main(String[] args) {

		list = new ArrayList<>();
		String str = "ABCD";
		
		visited = new boolean[str.length()+1];
		dfs(str, "", 0);

		System.out.println(list);
		
	}

	public static void dfs(String str, String temp, int depth) {

		if(!temp.equals("")) {
			if(!list.contains(temp)) list.add(temp);
		}
		// 재귀 종료조건 : depth가 문자열의 길이와 같아지면 리턴
		if(depth == 2) return;
		
		for(int i = 0; i < str.length(); i++) {
			// 방문한적이 있으면 스킵
			if(visited[i]) continue;
			// 방문한적이없으면 방문 처리
			visited[i] = true;
			// 임시변수에 하나씩 붙여가면서 조합
			temp += str.charAt(i);
			// 재귀, 앞서 붙인 변수에 하나씩 더하면서 문자를 만듬
			dfs(str, temp, depth+1);
			// 조합이 완료되면 직전에 방문한 인덱스를 false로 변경
			visited[i] = false;
			// temp에서 마지막 자리의 숫자를 제외하고 갱신
			temp = temp.substring(0, temp.length()-1);
		}
	}

}
