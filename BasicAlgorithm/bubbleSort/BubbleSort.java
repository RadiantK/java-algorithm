package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		int size = a.length;
		
		// �迭�� ũ�� -1��ŭ �ݺ��� ����
		for(int i = 1; i < size; i++) {
			
			boolean swapped= false;
			// �� ���庰 �� Ƚ���� �迭 ũ���� ������带 �� ��ŭ ��
			for(int j = 0; j < size-i; j++) {
				
				// ���� �ε����� �����ε������� ũ�� �ٲ�
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					swapped = true;
				}
			}
			// ���ҵ����� ���ٸ� �̹� ���� ��ٴ� �ǹ��̹Ƿ� �ݺ��� ����
			if(swapped == false) {
				break;
			}
		}
	}
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {

		int[] a = {80, 50, 70, 10, 60, 90, 20, 40, 30};
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
	}
}