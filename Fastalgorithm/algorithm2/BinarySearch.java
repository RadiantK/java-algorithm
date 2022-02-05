package algorithm2;

// ���ĵ� ������ �ϳ��� ���� ��ġ ã��
// 2�� Ž�� Ȱ�� Binary Search
public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

		int target = 70;
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right) / 2;
		int temp = arr[mid];
		boolean find = false;
		
		while(left<=right) {
			if(target == temp) {
				find = true;
				break;
			} else if(target < temp) {
				right = mid -1;
			} else {
				left = mid +1;
			}
			
			mid = (left + right) /2;
			temp = arr[mid];
		}
		
		if(find == true) {
			mid++;
			System.out.println("ã�� ���� "+ mid + "��°�� �ֽ��ϴ�.");
		} else {
		System.out.println("ã�� ���� �����ϴ�.");
		}
	}

}
