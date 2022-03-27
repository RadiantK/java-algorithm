package visitedLength49994;

class Solution {
	int[] _x = {-1,1,0,0};
	int[] _y = {0,0,-1,1};
    public int solution(String  dirs) {
        int answer = 0;
        boolean[][] visited = new boolean[11][11];
        char[] move = {'U', 'D', 'L', 'R'};
        int x = 5;
        int y = 5;
        
        for(int i = 0; i < dirs.length(); i++) {
        	char ch = dirs.charAt(i);
        	int nx = 0;
        	int ny = 0;
        	
        	for(int j = 0; j < 4; j++) {
        		if(ch == move[j]){
        			nx = x + _x[j];
        			ny = y + _y[j];
        		}
        	}
        	if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
        	if(visited[nx][ny]) continue;
        	if(!visited[nx][ny]) {
	        	visited[nx][ny] = true;
	        	visited[x][y] = true;
	        	answer++;
        	}
        	x = nx;
        	y = ny;
        }
        System.out.println(x + " " + y);
        return answer;
    }
}

public class VisitedLength {

	public static void main(String[] args) {

		Solution s = new Solution();
		String dirs1 = "ULURRDLLU";
//		String dirs2 = "LULLLLLLU";
		
		System.out.println(s.solution(dirs1));
	}

}
