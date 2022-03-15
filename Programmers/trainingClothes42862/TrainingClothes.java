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
        
      //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
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
        
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    count++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        //answer은 전체 학생수에서 잃어버린 학생 수를 뺀다.
        //후에 여벌옷을 가진 학생이 도난 당했으면 그 수만큼 더해주고 옷을 빌려준 학생 수 만큼 다시 더해준다.
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
