package tired87946;

class Solution {
	static boolean[] visited;
	static int answer;
	
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);

        return answer;
    }
    
    static void dfs(int tired, int[][] dungeons, int depth) {
    	
    	// 완전탐색으로 모든 경우의 수를 구함
    	for(int i = 0; i < dungeons.length; i++) {
    		if(!visited[i] && tired >= dungeons[i][0]) {	
	    		visited[i] = true;
	    		dfs(tired - dungeons[i][1], dungeons, depth+1);
	    		visited[i] = false;
    		} 
    	}
    	// depth가 가장 클 때가 가장 큰 경우의수
    	answer = Math.max(answer, depth);
    }
}

public class Tired {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[][] dungeons = {
				{80,20},
				{50,40},
				{30,10}
		};
		System.out.println(s.solution(80, dungeons));
	}

}
