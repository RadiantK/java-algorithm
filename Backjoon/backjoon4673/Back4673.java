package backjoon4673;

public class Back4673 {

	public static void main(String[] args) {
		boolean[] checkNum = new boolean[10001];

		for(int i=1; i<10001; i++) {
			int n = selfNumber(i);
			if(n <= 10000) {
				checkNum[n] = true;
			}
		}
		for(int i=1; i<10001; i++) {
			if(checkNum[i] == false) {
				System.out.println(i);
			}
		}
	}
	public static int selfNumber(int num) {
		int sum = num;
		while(num != 0) { // n�� 0�̸� �ݺ��� Ż��
			sum += (num%10); // ���� �ڸ��� �ִ� ���� ����
			num /= 10; // �ڸ����� �ϳ��� ������
		}
		return sum;
	}

}
