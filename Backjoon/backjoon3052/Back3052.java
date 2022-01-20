package backjoon3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		boolean bool = false;
		int count = 0;
		
		for (int i =0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for(int i =0; i<10; i++) {		
			bool = false;
			
			for (int j= i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					bool = true;
					break;
				}
			}
			if(bool == false) {
				count++;
			}
			
		}
		bw.write(count+"\n");
		br.close();
		bw.flush();
		bw.close();		
		
//		HashSet<Integer> set = new HashSet<>();
//		
//		for(int i = 0; i < 10; i++) {
//			set.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		bw.write(set.size()+"\n");
//		
//		br.close();
//		bw.flush();
//		bw.close();
	}

}
