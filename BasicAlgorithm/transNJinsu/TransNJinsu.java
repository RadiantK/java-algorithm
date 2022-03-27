package transNJinsu;

public class TransNJinsu {

	// ���� ��ȯ
	public static void main(String[] args) {

		char[] ch = new char[1000];
		
		int num = 52;
		int jinsu = 2;
		
		int i = 0;
		while(num > 0) {
			int temp = num % jinsu;
			
			if(temp >= 10 && temp <= 15) {
				// ���� 10~15 ������ �� temp�� 10�̸� 10-10+'A'�� 10, 11�̸� B 
				ch[i] = (char) ('A' + (temp - 10));
			}
			else { 
				// ������ ���ڵ��� �״�� ���
				ch[i] = (char) ('0' + temp);
			}
			num /= jinsu;
			i++;
		}
		
		for(; i >=0; i--) {
			System.out.print(ch[i]);
		}
	}

}
