package com.learn.datastructurealgorithm.sorting;

public class BubbleSort {
	/*
	 * Theory
	 * UnsortedIndex will be len of array. 0th element will be compared to 0+1th element
	 * If lesser than 0 then it will be Swapped and so on till len of array. In the end of iteration
	 * UnsortedIndex will be decremented at each completion of iteration
	 * In place algorithm i.e logical partitioning of array no extra array/memory
	 * O(n2)
	 * Algorithm degrades quickly
	 * 
	 * Stable sort is one which preserves relative order in case of duplicates
	 * i.e. In case of 9 at index 4 and 9 at index 10 ,after sorting 9 at index 4 will always be before 9 at index 10.
	 * unstable sort is one which may not preserve relative order.
	 * Bubble sort is stable sort
	 */
	
	public static boolean isPrint = true;
	
	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		intArray = bubbleSort(intArray);
		
		System.out.print("Sorted Array => ");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] bubbleSort(int[] intArray) {
		int unsortedIndex=intArray.length-1;
		
		for(int i=0; i < intArray.length; i++) {
			//when unsorted index and start index is consecutive no
			if(unsortedIndex == 1) {
				return intArray;
			}
			
			for(int j = 0; j < unsortedIndex; j++ ) {
				int curEl=intArray[j];
				int nextEl=intArray[j+1];
				if(curEl > nextEl) {
					intArray[j] = nextEl;
					intArray[j+1] = curEl;
				}
			}
			
			if(isPrint) {
				System.out.println("Iteration "+ i);
				for (int el : intArray) {
					System.out.print(el+" ");
				}
				System.out.println();
			}
			
			unsortedIndex = unsortedIndex-1;
			
		}
		
		return intArray;
	}
	
	
	
	
}
