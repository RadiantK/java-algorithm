package algorithm29;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] input = new int[t];
		
		for(int i = 0; i < t; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		
		align(input);
	}
	
	public static void align(int[] input) {
		
		boolean aFlag = true;
		boolean dFlag = true;
		
		for(int i = 0; i < input.length-1; i++) {
			if(input[i] - input[i+1] != -1) {
				aFlag = false;
				break;
			}
		}
		
		for(int i = 0; i < input.length-1; i++) {
			if(input[i] - input[i+1] != 1) {
				dFlag = false;
				break;
			}
		}
		
		if(aFlag) {
			System.out.println("Ascending(��������)");
		} else if(dFlag) {
			System.out.println("Descending(��������)");
		} else {
			System.out.println("mixed(���ڰ� ����)");
		}
	}

}
