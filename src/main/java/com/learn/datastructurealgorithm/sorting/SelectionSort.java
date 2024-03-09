package com.learn.datastructurealgorithm.sorting;

public class SelectionSort {
	
	/*
	 * Theory
	 * lastUnsortedIndex will be last index which will be decrement at each iteration
	 * We will assume Largest index will be 0 and element will be compare to the next index 
	 * if it is greater than current elem at largest index then we will reassign largest index to next element's index
	 * in the end of iteration will swap largest index element with lastUnsortedIndex element
	 * 
	 * O(n^2)
	 * Unstable algorithm
	 */
	public static boolean isPrint = true;
	
	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		intArray = selectionSort(intArray);
		
		System.out.print("Sorted Array => ");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] selectionSort(int[] intArray) {
		
		int unsortedIndex=intArray.length-1;
		int largeIndex=0;
		for(int i=0;i<intArray.length;i++) {
			
			if(unsortedIndex < 1) {
				return intArray;
			}
			
			largeIndex=0;
	
			for(int j=1;j<=unsortedIndex;j++) {
				if(intArray[j]>intArray[largeIndex]) {
					largeIndex=j;
				}
			}
			
			int temp = intArray[unsortedIndex];
			intArray[unsortedIndex] = intArray[largeIndex];
			intArray[largeIndex] = temp;
			unsortedIndex--;
			
			if(isPrint) {
				System.out.println("Iteration "+ i);
				for (int el : intArray) {
					System.out.print(el+" ");
				}
				System.out.println();
			}
		}
		
		return intArray;
	}
}
