package algorithm27;

import java.util.Scanner;

public class Snail {
	
	// 달팽이 배열
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	sc.close();
    	
        int[][] arr = new int[t][t];
    	
        int row = 0; // 행
        int col = -1; // 열
        int s = 1; // 행과 열을 1씩 증가 감소 시키는 용도
        int k = t; // 배열의 크기
        int n = 0; // 배열에 입력될 숫자
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < k; j++) {
        		n = n + 1;
        		col = col + s; // 열을 1씩 증가 감소 시킴
        		arr[row][col] = n;
        	}
        	k--;
        	
        	for(int j = 0; j < k; j++) {
        		n += 1;
        		row = row + s; // 행을 1씩 증가 감소 시킴
        		arr[row][col] = n;
        	}
        	s = s * (-1);
        }
        
        // 배열 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
        	    System.out.printf("%2d ", arr[i][j]);
            } 
            System.out.println();
        }
    }
}