package skillTree49993;

class Solution {
	// ��ųƮ��
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String s : skill_trees) {
        	// ��ųƮ�� �迭�� ���ڿ�
        	String str = s;
        	
        	for(int i = 0; i < s.length(); i++) {
        		// �ε����� �ϳ��ϳ� ��
        		String temp = String.valueOf(s.charAt(i));
        		// skill�� temp�� ������ �������� �ٲ���
        		if(!skill.contains(temp)) {
        			str = str.replaceAll(temp, "");
        		}
        	}
        	// indexOf�� ���� skill�� ù��° ���ڰ� �� �տ� ������ ���ϰ� +1
        	if(skill.indexOf(str) == 0) answer++;
        }

        return answer;
    }
}

class Solution2 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

		for(String str : skill_trees) {
			String s = str.replaceAll("[^"+skill+"]", "");
			if(skill.indexOf(s) == 0) answer++;
		}
        return answer;
    }
}

public class SkillTree {
	
	static int[] target = new int[] { 1, 2, 3 };
	// ��� ���ڸ� �����ߴ����� �˷��ִ� ����.
	static boolean[] visited = new boolean[3];

	public static void main(String[] args) {
		permutation(0, "");
	}

	// ���� �޼���(cnt�� ���� Ƚ��, result�� ���)
	private static void permutation(int cnt, String result) {
		// 2���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		if (cnt == 2) {
			System.out.println(result);
			return;
		}
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = 0; i < 3; i++) {
			// �̹� �ش� ���ڸ� ������ ��쿡�� ��ŵ.
			if (visited[i]) {
				continue;
			}
			// �������� �������, �����ߴٴ� ǥ�ø� ���ش�.
			visited[i] = true;
			// �ڽ��� ��� ȣ���Ѵ�.
			permutation(cnt + 1, result + target[i]);
			// ������ �����Ѵ�.
			visited[i] = false;
		}
	}
}