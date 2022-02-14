package truckPassingBridge72583;

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {   
        Queue<Integer> q = new LinkedList<>();
        
        int time = 0; // �ɸ��� �ð� ī��Ʈ
        int truckTotal = 0; // �ٸ����� �ö� Ʈ���� ����
        for(int truck : truck_weights) {
        	
        	while(true) {
        		// �ٸ��� ��� ���� ��
        		if(q.isEmpty()){
            		q.offer(truck);
            		truckTotal += truck;
            		time++;
            		break;
            	}
        		// �ٸ� ���̸�ŭ Ʈ�� ���� ���� �ʾ��� ��
        		else if(q.size() < bridge_length) {
        			// �ٸ��� ���� Ʈ���� ���Կ� ���� Ʈ���� ���԰� �ٸ��� �ߵ� �� �ִ� ���Ժ��� ���� ��
        			if(truckTotal + truck <= weight) {
	        			q.offer(truck);
	        			time++;
	        			truckTotal += truck;
	        			break;
        			} 
        			// �ٸ� ���� Ʈ���� ���Կ� ���� Ʈ���� ���԰� �ٸ��� �ߵ� �� �ִ� ���Ը� �Ѿ��� ��
        			else if(truckTotal + truck > weight) {
        				// ť�� �ƹ����� �־ �ö� Ʈ���� �ٸ��� �̵��� �� �ְ� ����
        				q.offer(0);
        				time++;
        			}
        		}
        		// �ٸ��� �ö� Ʈ���� ���� �ٸ��� ���̿� ���� ��
        		else if(q.size() == bridge_length) {
        			// �ٸ����� �����ö��� �ð��� ������ �ʴ´�.
        			truckTotal -= q.poll();
        		}
        	}	
        }
        // ������ Ʈ���� �ٸ��� �ö� ���¿��� �ٸ��� ���̸� �����ָ�, ��� Ʈ���� ����ϴµ� �ɸ��ð�.
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

