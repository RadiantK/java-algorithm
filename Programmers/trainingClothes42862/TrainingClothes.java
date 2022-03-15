package trainingClothes42862;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int losted = 0;
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
      //���� ���� ������ �ִ� �л��� ���� ���ϸ� ������ �� ������ �����.
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]) {
                    losted++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        //���� �����ְ� -1�� ����� ���� �л����� �������� �ʰ� �Ѵ�.
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    count++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        //answer�� ��ü �л������� �Ҿ���� �л� ���� ����.
        //�Ŀ� �������� ���� �л��� ���� �������� �� ����ŭ �����ְ� ���� ������ �л� �� ��ŭ �ٽ� �����ش�.
        answer = n - lost.length + losted + count;
        
        return answer;
    }
}


class Solution2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        HashSet<Integer> ko = new HashSet<Integer>();
        for(int k : reserve) {
            ko.add(k);
        }
        for(int i =0;i<lost.length;i++) {
            if(ko.contains(lost[i])) {

                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }


        for(int i =0;i<lost.length;i++) {

            if(ko.contains(lost[i]-1)) {
                answer++;
                ko.remove(lost[i]-1);
            }else if(ko.contains(lost[i]+1)) {
                answer++;
                ko.remove(lost[i]+1);
            }
        }

        return answer;
    }
}


public class TrainingClothes {

	public static void main(String[] args) {

		Solution s = new Solution();
		int n = 5;
		int[] lost = {2, 4};
		int[] lost2 = {2, 4};
		int[] lost3 = {1, 2, 3, 4};
		
		int[] reserve = {1,3,5};
		int[] reserve2 = {3};
		int[] reserve3 = {3,4};

		System.out.println(s.solution(n, lost, reserve));
		System.out.println(s.solution(n, lost2, reserve2));
		System.out.println(s.solution(n, lost3, reserve3));
	}

}
