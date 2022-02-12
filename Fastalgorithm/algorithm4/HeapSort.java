package algorithm4;

public class HeapSort {
	
	private int SIZE;
	private int heapArr[];
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int[50];
	}
	
	// 부모요소는 (자식요소의 인덱스 / 2) 이므로 배열의 0번인덱스는 사용하지 않음 1부터 사용 
	public void insertHeap(int input) {
		int i = ++SIZE; // 배열의 1인덱스부터 저장시키기위함
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
		// 마지막 노드를 최상위 노드와 비교하면서 정렬
		data = heapArr[1]; // root 노드
		
		temp = heapArr[SIZE];
		SIZE -= 1;
		parent = 1; // 부모 노드
		child = 2; // 자식의 왼쪽노드, 오른쪽 노드는 child + 1
		
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
			System.out.printf("\n 출력 : [%d]", data);
		}

	}

	
}
