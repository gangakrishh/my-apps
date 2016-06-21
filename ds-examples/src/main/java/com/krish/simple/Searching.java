package com.krish.simple;

public class Searching {

	public static void main(String args[]){
		int[] elements = {19,13,42,32,32,3};
		int search = 32;
		System.out.println("index :"+basicSearch(elements,search));
	}
	public static int basicSearch(int[] array, int find){
		for(int i=0;i<array.length;i++){
			if(array[i] == find){
				return i;
			}
		}
		return -1;
		
	}
}
