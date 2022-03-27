package transNJinsu;

public class TransNJinsu {

	// 진수 변환
	public static void main(String[] args) {

		char[] ch = new char[1000];
		
		int num = 52;
		int jinsu = 2;
		
		int i = 0;
		while(num > 0) {
			int temp = num % jinsu;
			
			if(temp >= 10 && temp <= 15) {
				// 수가 10~15 사이일 때 temp가 10이면 10-10+'A'로 10, 11이면 B 
				ch[i] = (char) ('A' + (temp - 10));
			}
			else { 
				// 나머지 숫자들은 그대로 출력
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
