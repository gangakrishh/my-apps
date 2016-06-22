package com.krish.simple.sort;

public class HeapProblems {

	private static void heapify(int a[], int index){
		int left = getLeft(index);
		int right = getRight(index);
		int largest = -1;
		if( left <= a.length && a[left] > a[index]){
			largest = left;
		}else{
			largest = index;
		}
		if( right <= a.length && a[right] > a[largest]){
			largest = right;
		}
		if(largest != index){
			int temp = a[largest];
			a[largest] = a[index];
			a[index] = temp;
			heapify(a,largest);
		}
	}
	private static int getLeft(int index){
		return (2 * index) + 1;
	}
	private static int getRight(int index){
		return (2 * index ) + 2;
	}
	
	public static void main(String[] args){
	 int[] a = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
	 heapify(a,1);
	 for(int k : a){
		 System.out.print(k);
		 System.out.print(",");
	 }
	}
}
