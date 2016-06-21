package com.krish.simple.sort;

public class SortExamples {

	private static void bubbleSort(int[] ar){
		int time = 0;
		for(int i=0; i<ar.length-1; i++){
			for(int j=i+1; j<ar.length; j++){
				time++;
			if(ar[i] >= ar[j]){
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
			}
		}
		System.out.println("time complexities"+time);
				
	}
	private static int[] selectionSort(int[] ar){
		/*//int min = 0;
		int[] temp = new int[ar.length];
		for(int i = 0; i<ar.length-1; i++){
			int min = i;
			for(int j=i+1;j<ar.length;j++){
				if(ar[min] > ar[j]){
					min = j;
				}
			}
			temp[i] = ar[min];
		}
		return temp;*/
		
		int n = ar.length;
		 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (ar[j] < ar[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = ar[min_idx];
            ar[min_idx] = ar[i];
            ar[i] = temp;
        }
        return ar;
	}
	
	private static void insertionSort(int[] arrary){
	
		int n = arrary.length;
        for (int i=1; i<n; ++i){
            int key = arrary[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arrary[j] > key){
            	arrary[j+1] = arrary[j];
                j = j-1;
            }
            arrary[j+1] = key;
        }
	}
	
	
	
	private static void findFibnocciSeries(int n){
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 2;
		int i = 0;
		System.out.println(f1);
		System.out.println(f2);
		while(i<=n){
			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			i++;
		}
	}
	public static void main(String[] args){
//		int[] a = {5, 1, 4, 2, 8};
		int[] a1 = {8, 5, 4, 2, 1};
		
		//bubbleSort(a1);
		//a1 = selectionSort(a1);
		insertionSort(a1);
		
		for( int k : a1){
			System.out.print(k);
			System.out.print(",");
		}
		
		
		//findFibnocciSeries(3);
	}
}
