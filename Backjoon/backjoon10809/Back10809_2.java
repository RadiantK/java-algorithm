package backjoon10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10809_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int result : arr) {
			System.out.print(result+" ");
		}

	}

}
