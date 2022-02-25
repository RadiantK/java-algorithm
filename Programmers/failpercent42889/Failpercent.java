package failpercent42889;

import java.util.*;

class Solution {	
	private class Fail{
		int stage;
		double fail;
		
		private Fail(int stage, double fail) {
			this.stage = stage;
			this.fail = fail;
		}

		public String toString() {
			return "stage : "+ stage + " failpercent : " + fail +"\n";
		}
	}

	// 실패율을 내림차순 정렬
	private class Com implements Comparator<Fail> {
		@Override
		public int compare(Fail f1, Fail f2) {
			// 실패율이 큰것이 앞으로옴(내림차순)
			if(f1.fail < f2.fail) {
				return 1;
			} else if(f1.fail > f2.fail) {
				return -1;
			}else {
				// 실패율이 같은 경우 스테이지가 작은 것이 앞으로 오도록 함(오름차순)
				if(f1.stage > f2.stage) {
					return 1;
				} else if(f1.stage < f2.stage) {
					return -1;
				}
			}
			return 0;
		}
		
	};

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int total = stages.length;
        List<Fail> list = new ArrayList<>();

        // 5라운드를 클리어한 인원은 6으로 표시됨으로 n+1
        int[] player = new int[N+1];
        for(int stage : stages) {
        	// 스테이지에 있는 플레이어의 수를 저장, 1스테이지를 -1해서 0번 인덱스에 저장
        	player[stage-1]++;
        }

        // 각 스테이지의 실패율을 리스트에 저장
        for(int i=0; i < N; i++) {
        	// 0이면 스테이지에 도달한 플레이어가 없음
        	if(player[i] == 0) {
        		// 스테이지에 플레이어가 없으면 실패율은 0, 스테이지는 1부터이므로 i+1로 저장
        		list.add(new Fail(i+1, 0));
        	}
        	// 실패율을 구할 수 있는 경우
        	else {
        		// i+1번째 스테이지에 실패율을 구해서 저장
        		list.add(new Fail(i+1, (double)player[i] / total));
        		// 현재 스테이지에 있는 사용자는 다음 스테이지에 가지 못했으므로 total에서 빼줌
        		total -= player[i];
        	}
        }
        System.out.println(list);
        Collections.sort(list, new Com());
        for(int i = 0; i < N; i++) {
        	answer[i] = list.get(i).stage;
        }
        return answer;
    }
}

public class Failpercent {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		System.out.println(Arrays.toString(s.solution(5, stages)));
	}

}
