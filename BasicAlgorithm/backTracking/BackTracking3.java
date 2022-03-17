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
		// ��� �������� : depth�� ���ڿ��� ���̿� �������� ����
		if(depth == 2) return;
		
		for(int i = 0; i < str.length(); i++) {
			// �湮������ ������ ��ŵ
			if(visited[i]) continue;
			// �湮�����̾����� �湮 ó��
			visited[i] = true;
			// �ӽú����� �ϳ��� �ٿ����鼭 ����
			temp += str.charAt(i);
			// ���, �ռ� ���� ������ �ϳ��� ���ϸ鼭 ���ڸ� ����
			dfs(str, temp, depth+1);
			// ������ �Ϸ�Ǹ� ������ �湮�� �ε����� false�� ����
			visited[i] = false;
			// temp���� ������ �ڸ��� ���ڸ� �����ϰ� ����
			temp = temp.substring(0, temp.length()-1);
		}
	}

}
