package pickofdoll64061;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// �����̱�
class Solution {
    public int solution(int[][] board, int[] moves) {
    	int answer = 0;
    	
    	// ���� ������ ��Ƶ� ����
    	Stack<Integer> st = new Stack<>();
    	st.push(0); // ����·� ���� ���� ���ϸ� ������ ��
    	
    	for(int i = 0; i < moves.length; i++) {
    		
    		for (int j = 0; j < board.length; j++) {
    			if(board[j][moves[i]-1] == 0)
    				continue;
    			// board[j][moves[i]-1] �迭���� 0�̸� ������ �����Ƿ� �Ѿ
    			if(board[j][moves[i]-1] != 0) {
    				// ���ؿ� ������ �����̶� ���� ���� ������ ������ �����ϰ� 2�ø�
    				if(!st.isEmpty() && st.peek() == board[j][moves[i]-1]) {
    					st.pop();
    					answer +=2;
    				} else {
    					// ���� ������ ����ִ� ������ ������������ ��ġ���������� �߰�
    					st.push(board[j][moves[i]-1]);
    				}
    				// ���� ����(����)�� 0���� ġȯ
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
