package algorithm4;

public class HeapSort {
	
	private int SIZE;
	private int heapArr[];
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int[50];
	}
	
	// �θ��Ҵ� (�ڽĿ���� �ε��� / 2) �̹Ƿ� �迭�� 0���ε����� ������� ���� 1���� ��� 
	public void insertHeap(int input) {
		int i = ++SIZE; // �迭�� 1�ε������� �����Ű������
		// max heap
//		while((i != 1) && (input > heapArr[i / 2])) { 
		// min heap
		while((i != 1) && input < heapArr[i / 2]) {
			heapArr[i] = heapArr[i/2];
			i = i/2;
		}
		heapArr[i] = input;
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		int parent, child;
		int data, temp;
		// ������ ��带 �ֻ��� ���� ���ϸ鼭 ����
		data = heapArr[1]; // root ���
		
		temp = heapArr[SIZE];
		SIZE -= 1;
		parent = 1; // �θ� ���
		child = 2; // �ڽ��� ���ʳ��, ������ ���� child + 1
		
		while(child <= SIZE) {
//			if((child < SIZE) && (heapArr[child] < heapArr[child+1])){ // max heap
			if((child < SIZE) && (heapArr[child] > heapArr[child+1])) { // min heap
				child++;
			}
//			if(temp >= heapArr[child]) break; // max heap
			if(temp <= heapArr[child]) break; // min heap
			
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		heapArr[parent] = temp;
		return data;
	}
	
	private void printHeap() {
		System.out.printf("\n Min Heap : ");
		for(int i = 1; i <= SIZE; i++) {
			System.out.printf("[%d] ", heapArr[i]);
		}
	}

	public static void main(String[] args) {

		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		h.insertHeap(40);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSize();
		for(int i = 1; i <= n; i++) {
			data = h.deleteHeap();
			System.out.printf("\n ��� : [%d]", data);
		}

	}

	
}
