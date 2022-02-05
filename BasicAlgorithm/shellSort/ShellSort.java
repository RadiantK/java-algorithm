package shellSort;

import java.util.Arrays;

public class ShellSort {
	
	// ���� ����ִ� �迭
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};
	
	private static int getGap(int length) {
		int index = 0;
		// �ּ��� �κ� �迭�� ���Ұ� 2������ �񱳵ǵ��� ������
		int len = (int)(length / 2.25);
		
		while(gap[index] < len) {
			index++;
		}
		return index;
	}
	public static void shellSort(int[] a) {
		int size = a.length;
		int index = getGap(size);
		
		// gap[index]������ gap[0]���� �ݺ�
		for(int i = index; i >= 0; i--) {
			
			//�� �κ��� ����Ʈ�� ���ؼ� �������� ����
			for(int j = 0; j < gap[i]; j++) {
				insertion_sort(a, j, size, gap[i]);
			}
		}
	}
	
	public static void insertion_sort(int[] a, int start, int size, int gap) {
		
		// �κ� �迭�� �� ��° ���Һ��� size���� �ݺ� (gap ���� �ǳʶ�) 
		for(int i = start + gap; i < size; i += gap) {
			
			int target = a[i];
			int j = i - gap;
			
			// Ÿ���� ���������� ���� �� ���� �ݺ�
			while(j >= start && target < a[j]) {
				// ���� ���Ҹ� �� ĭ�� �ڷ� �̷�
				a[j + gap] = a[j];
				j -= gap;
			}
			a[j + gap] = target;
		}
	}

	public static void main(String[] args) {

		int[] a = {80, 50, 70, 10, 60, 90, 20, 40, 30};
		shellSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
