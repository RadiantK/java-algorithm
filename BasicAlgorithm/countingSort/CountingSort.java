package countingSort;

public class CountingSort {

	public static void main(String[] args) {

		// 수의 범위 0~100
		int[] arr = new int[101];
		
		// 수열의 크기 : 50
		for(int i = 0; i < 20; i++) {
			arr[(int)(Math.random()*101)]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			while(arr[i]-- > 0) {
				System.out.print(i + " ");
			}
		}

	}

}
