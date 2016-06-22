package com.krish.simple.sort;

public class HeapProblems {

	private static void heapify(int a[], int n, int index) {
		int left = getLeft(index);
		int right = getRight(index);
		int largest = -1;
		if (left < n && a[left] > a[index]) {
			largest = left;
		} else {
			largest = index;
		}
		if (right < n && a[right] > a[largest]) {
			largest = right;
		}
		if (largest != index) {
			int temp = a[largest];
			a[largest] = a[index];
			a[index] = temp;
			heapify(a, n, largest);
		}
	}

	private static int getLeft(int index) {
		return (2 * index) + 1;
	}

	private static int getRight(int index) {
		return (2 * index) + 2;
	}

	private static void buildHeap(int a[]) {
		for (int i = (a.length) / 2; i >= 0; i--) {
			heapify(a, a.length, i);
		}
	}
	
	private static void sort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, arr.length, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr,i, 0);
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 };
		for (int k : a) {
			System.out.print(k);
			System.out.print(",");
		}
		System.out.println("after");
		// heapify(a,1);
		 buildHeap(a);
		//sort(a);
		for (int k : a) {
			System.out.print(k);
			System.out.print(",");
		}
		
		//System.out.println(Integer.toBinaryString(255));
	}
}
