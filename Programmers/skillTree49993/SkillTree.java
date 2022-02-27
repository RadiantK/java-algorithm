package skillTree49993;

class Solution {
	// 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String s : skill_trees) {
        	// 스킬트리 배열의 문자열
        	String str = s;
        	
        	for(int i = 0; i < s.length(); i++) {
        		// 인덱스를 하나하나 비교
        		String temp = String.valueOf(s.charAt(i));
        		// skill에 temp가 없으면 공백으로 바꿔줌
        		if(!skill.contains(temp)) {
        			str = str.replaceAll(temp, "");
        		}
        	}
        	// indexOf를 통해 skill의 첫번째 문자가 맨 앞에 있으면 리턴값 +1
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
	// 대상 숫자를 선택했는지를 알려주는 집합.
	static boolean[] visited = new boolean[3];

	public static void main(String[] args) {
		permutation(0, "");
	}

	// 순열 메서드(cnt는 선택 횟수, result는 결과)
	private static void permutation(int cnt, String result) {
		// 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 2) {
			System.out.println(result);
			return;
		}
		// 대상 집합을 순회하며 숫자를 하나 선택한다.
		for (int i = 0; i < 3; i++) {
			// 이미 해당 숫자를 선택한 경우에는 스킵.
			if (visited[i]) {
				continue;
			}
			// 선택하지 않은경우, 선택했다는 표시를 해준다.
			visited[i] = true;
			// 자신을 재귀 호출한다.
			permutation(cnt + 1, result + target[i]);
			// 선택을 해제한다.
			visited[i] = false;
		}
	}
}