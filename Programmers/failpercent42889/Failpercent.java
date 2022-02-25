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

	// �������� �������� ����
	private class Com implements Comparator<Fail> {
		@Override
		public int compare(Fail f1, Fail f2) {
			// �������� ū���� �����ο�(��������)
			if(f1.fail < f2.fail) {
				return 1;
			} else if(f1.fail > f2.fail) {
				return -1;
			}else {
				// �������� ���� ��� ���������� ���� ���� ������ ������ ��(��������)
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

        // 5���带 Ŭ������ �ο��� 6���� ǥ�õ����� n+1
        int[] player = new int[N+1];
        for(int stage : stages) {
        	// ���������� �ִ� �÷��̾��� ���� ����, 1���������� -1�ؼ� 0�� �ε����� ����
        	player[stage-1]++;
        }

        // �� ���������� �������� ����Ʈ�� ����
        for(int i=0; i < N; i++) {
        	// 0�̸� ���������� ������ �÷��̾ ����
        	if(player[i] == 0) {
        		// ���������� �÷��̾ ������ �������� 0, ���������� 1�����̹Ƿ� i+1�� ����
        		list.add(new Fail(i+1, 0));
        	}
        	// �������� ���� �� �ִ� ���
        	else {
        		// i+1��° ���������� �������� ���ؼ� ����
        		list.add(new Fail(i+1, (double)player[i] / total));
        		// ���� ���������� �ִ� ����ڴ� ���� ���������� ���� �������Ƿ� total���� ����
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
