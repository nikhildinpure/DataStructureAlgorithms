package com.learn.datastructurealgorithm.sorting;

public class InsertionSort {
	/*
	 * Theory
	 * Element at 0 will be assumed as at sorted position , 
	 * hence unsortedIndex will be 1 which will be incremented at each iteration
	 * unsortedIndex will be new element which will be compared to left element 
	 * and if right element is lesser then it will be shifted to left
	 *  
	 * 
	 * O(n^2)
	 * Stable algorithm
	 * 
	 */
	public static boolean isPrint = true;
	
	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		intArray = insertionSort(intArray);
		
		System.out.print("Sorted Array => ");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] insertionSort(int[] intArray) {
		
		
		for(int unsortedIndex=1;unsortedIndex<intArray.length;unsortedIndex++) {
			
			int newElement=intArray[unsortedIndex];
			
			int j;
			
			for(j=unsortedIndex; j > 0 && intArray[j-1] > newElement; j--) {
				intArray[j] = intArray[j-1];
			}
			
			intArray[j]=newElement;
			
			if(isPrint) {
				System.out.println("Iteration "+ unsortedIndex);
				for (int el : intArray) {
					System.out.print(el+" ");
				}
				System.out.println();
			}
		}
		
		return intArray;
	}
	
}
