package pickofdoll64061;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 인형뽑기
class Solution {
    public int solution(int[][] board, int[] moves) {
    	int answer = 0;
    	
    	// 뽑은 인형을 담아둘 스텍
    	Stack<Integer> st = new Stack<>();
    	st.push(0); // 빈상태로 다음 값과 비교하면 에러가 남
    	
    	for(int i = 0; i < moves.length; i++) {
    		
    		for (int j = 0; j < board.length; j++) {
    			if(board[j][moves[i]-1] == 0)
    				continue;
    			// board[j][moves[i]-1] 배열값이 0이면 인형이 없으므로 넘어감
    			if(board[j][moves[i]-1] != 0) {
    				// 스텍에 마지막 인형이랑 새로 뽑은 인형이 같으면 제거하고 2올림
    				if(!st.isEmpty() && st.peek() == board[j][moves[i]-1]) {
    					st.pop();
    					answer +=2;
    				} else {
    					// 뽑은 인형이 담겨있는 스텍의 마지막인형과 일치하지않으면 추가
    					st.push(board[j][moves[i]-1]);
    				}
    				// 꺼낸 인형(숫자)를 0으로 치환
    				board[j][moves[i]-1] = 0;
    				break;
    			}
    		}
    	}
    	return answer;
    }
}

class Solution2 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		
		for(int move : moves) {
			for(int i = 0; i < board.length; i++) {
				if(board[i][move-1] == 0)
					continue;
				if(board[i][move-1] != 0) {
					if(list.get(list.size()-1) == board[i][move-1]) {
						list.remove(list.size()-1);
						answer += 2;
					} else {
						list.add(board[i][move-1]);
					}
					board[i][move-1] = 0;
					break;
				}
			}
		}

		return answer;
	}
}

public class PickOfDoll {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(s.solution(board, moves));
	}

}
