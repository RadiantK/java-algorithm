package algorithm1;

// �迭�� ���� ū��, ���� ���� �� ã��
public class Algoritim1 {

	public static void main(String[] args) {

		int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int max = arr[0];
		int min = arr[0];
		int minpos=0;
		int maxpos=0;
		
		for(int i=0; i<arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
				minpos = i+1;
			}
			if (max <= arr[i]) {
				max = arr[i];
				maxpos = i+1;
			}
		}
		
		System.out.println("ū�� : "+max+", ����: "+maxpos);
		System.out.println("������ : "+min+", ����: "+minpos);
	}

}
