package algorithm14;

public class NumberOf {

	public static void main(String[] args) {
	
		int input = 112552258;
		int[] arr = new int[10];
		
		while(input != 0) {
			arr[input % 10]++;
			input = input/10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
