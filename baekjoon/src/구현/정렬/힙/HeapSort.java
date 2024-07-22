package 구현.정렬.힙;

public class HeapSort {
	public static void main(String[] args) {
		int n = 3; // 입력받은 수
		int size = n;
		int[] arr = new int[size];
		
		for(int i=n/2-1; i>=0; i--) {
			heapify(arr, size, i);
		}
		
		for(int i = n-1; i>=0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int[] arr, int size, int i) {
		int largertIdx = i;
		int leftIdx = 2*i + 1;
		int rightIdx = 2*i + 2;
		
		if(leftIdx < size && arr[leftIdx] > arr[largertIdx]) {
			largertIdx = leftIdx;
		}
		
		if(rightIdx < size && arr[rightIdx] > arr[largertIdx]) {
			largertIdx = rightIdx;
		}
		
		if(largertIdx != i) {
			swap(arr, i, largertIdx);
			heapify(arr, size, largertIdx);
		}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
