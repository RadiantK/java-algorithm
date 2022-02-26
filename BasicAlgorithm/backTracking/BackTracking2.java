package backTracking;

import java.util.*;

public class BackTracking2 {
	static boolean[] visited;
	static List<String> list;
	
	public static void main(String[] args) {

		list = new ArrayList<>();
		String str = "ABCD";
		
		visited = new boolean[str.length()+1];
		
		for(int i = 1; i <= str.length(); i++) {
			dfs(str, "", i);
		}
		System.out.println(list);
		
	}

	public static void dfs(String str, String temp, int depth) {

		if(depth == temp.length()) {
			if(!list.contains(temp)) {
				list.add(temp);
			}
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(visited[i]) continue;
			
			visited[i] = true;
			temp += str.charAt(i);
			dfs(str, temp, depth);
			visited[i] = false;
			temp = temp.substring(0, temp.length()-1);
		}
	}

}
