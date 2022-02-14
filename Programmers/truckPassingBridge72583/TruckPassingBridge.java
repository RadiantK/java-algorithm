package truckPassingBridge72583;

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {   
        Queue<Integer> q = new LinkedList<>();
        
        int time = 0; // 걸리는 시간 카운트
        int truckTotal = 0; // 다리위에 올라간 트럭의 무게
        for(int truck : truck_weights) {
        	
        	while(true) {
        		// 다리가 비어 있을 때
        		if(q.isEmpty()){
            		q.offer(truck);
            		truckTotal += truck;
            		time++;
            		break;
            	}
        		// 다리 길이만큼 트럭 수가 차지 않았을 때
        		else if(q.size() < bridge_length) {
        			// 다리의 위의 트럭의 무게와 다음 트럭의 무게가 다리가 견딜 수 있는 무게보다 작을 때
        			if(truckTotal + truck <= weight) {
	        			q.offer(truck);
	        			time++;
	        			truckTotal += truck;
	        			break;
        			} 
        			// 다리 위의 트럭의 무게와 다음 트럭의 무게가 다리가 견딜 수 있는 무게를 넘었을 때
        			else if(truckTotal + truck > weight) {
        				// 큐에 아무값을 넣어서 올라간 트럭이 다리를 이동할 수 있게 해줌
        				q.offer(0);
        				time++;
        			}
        		}
        		// 다리의 올라간 트럭의 수가 다리의 길이와 같을 때
        		else if(q.size() == bridge_length) {
        			// 다리에서 내려올때는 시간이 지나지 않는다.
        			truckTotal -= q.poll();
        		}
        	}	
        }
        // 마지막 트럭이 다리에 올라간 상태에서 다리의 길이를 더해주면, 모든 트럭이 통과하는데 걸린시간.
        return time + bridge_length;
    }
}

public class TruckPassingBridge {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] stages = {7,4,5,6};
		int[] stages2 = {10,10,10,10,10,10,10,10,10,10};
		System.out.println((s.solution(2, 10, stages)));
		System.out.println((s.solution(100, 100, stages2)));
	}
	
}

