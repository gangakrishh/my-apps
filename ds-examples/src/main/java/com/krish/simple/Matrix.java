package com.krish.simple;

public class Matrix {

	
	public static void main(String ars[]){
		int[][] matrix = buildMatrix(4,4);
		//iterateMatrix(matrix);
		spiralPrint(matrix);
	}
	public static int[][] buildMatrix(int m, int n){
		int i = 1;
		int[][] matrix = new int[m][n];
		for(int row = 0 ; row < m; row++){
			for(int col = 0; col < n; col++){
				matrix[row][col] = i;
				i++;
			}
		}
		return matrix;
	}
	private static void iterateMatrix(int[][] matrix){
		for (int row = 0; row < matrix.length; row++) {
			System.out.println("");
			for (int col = 0; col < matrix[row].length; col++) { 
				//matrix[row][col] = row + col;	
				System.out.print(matrix[row][col]);
			}
		}
	}
	private static void spiralPrint(int[][] matrix){
		int m = 4;
		int n = 4;
		int k = 0;
		int l = 0;
		int i = 0;
		while(k<m && l<n){
			for(i = l; i<n;++i){
				System.out.print(matrix[k][i]);
			}
			k++;
			for(i = k; i<m; ++i){
				System.out.print(matrix[i][n-1]);
			}
			n--;
			 /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	                System.out.print(matrix[m-1][i]);
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.print(matrix[i][l]);
	            }
	            l++;    
	        }        
		}
		/*for(int row = 0; row < matrix.length; row ++){
			System.out.print(matrix[k][row]);
		}*/
		
	}
}
