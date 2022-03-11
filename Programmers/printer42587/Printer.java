package printer42587;

import java.util.*;

class Solution {

	private class Print{
		int idx = 0;
		int pri = 0;
		private Print(int idx, int pri) {
			this.idx = idx;
			this.pri = pri;
		}
	}
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Print> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
        	// location과 순번 비교를 위해 클래스를 생성해서 인덱스를 넣어줌
        	q.offer(new Print(i, priorities[i]));
        }

        while(!q.isEmpty()) {
        	int peek = q.peek().pri;
        	
        	boolean flag = false;
        	// Print클래스에 저장된 값을 가져와서 가장 큰값이 큐의 처음 값보다 크면 큐를 빼고 다시
        	// 뒤에 넣어주면서 출력 우선 순위를 바꿔줌
        	for(Print p : q) {
        		if(p.pri > peek) {
        			flag = true;
        			break;
        		}
        	}
        	if(flag) {
        		Print temp = q.poll();
        		q.add(temp);
        	} else {
        		answer++;
        		Print res = q.poll();
        		if(res.idx == location) {
        			return answer;
        		}
        	}
        }
        return answer;
    }
}

public class Printer {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] p = {1, 1, 9, 1, 1, 1};
		
		System.out.println(s.solution(p, 0));
		
		int arr = 555;
		int sum = 0;
		while(arr > 0) {
			sum += arr % 10;
			arr /= 10;
		}
		System.out.println(sum);
	}

}
