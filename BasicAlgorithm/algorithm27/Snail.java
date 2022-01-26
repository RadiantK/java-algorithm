package algorithm27;

import java.util.Scanner;

public class Snail {
	
	// ������ �迭
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	sc.close();
    	
        int[][] arr = new int[t][t];
    	
        int row = 0; // ��
        int col = -1; // ��
        int s = 1; // ��� ���� 1�� ���� ���� ��Ű�� �뵵
        int k = t; // �迭�� ũ��
        int n = 0; // �迭�� �Էµ� ����
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < k; j++) {
        		n = n + 1;
        		col = col + s; // ���� 1�� ���� ���� ��Ŵ
        		arr[row][col] = n;
        	}
        	k--;
        	
        	for(int j = 0; j < k; j++) {
        		n += 1;
        		row = row + s; // ���� 1�� ���� ���� ��Ŵ
        		arr[row][col] = n;
        	}
        	s = s * (-1);
        }
        
        // �迭 ���
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
        	    System.out.printf("%2d ", arr[i][j]);
            } 
            System.out.println();
        }
    }
}