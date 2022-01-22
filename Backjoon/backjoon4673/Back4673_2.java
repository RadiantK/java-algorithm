package backjoon4673;

public class Back4673_2 {

	public static void main(String[] args) {

		boolean[] b = new boolean[10001];
		
		for(int i=0; i<10001; i++) {
			int n = d(i);
			
			if(n< 10001) {
				b[n] = true;
			}
		}
		
		for(int i=0; i<10001; i++) {
			if(b[i] != true) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int num) {
		int sum = num;
		
		while(num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

}
