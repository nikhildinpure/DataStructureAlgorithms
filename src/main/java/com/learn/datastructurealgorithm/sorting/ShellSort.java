package com.learn.datastructurealgorithm.sorting;

public class ShellSort {
	
	/*
	 * Theory 
	 * Insertion sort chooses which element to insert using gap of 1 Shell
	 * sort starts out with larger gap, here we are calculating gap as ArrayLen/2
	 * Its variation of insertion sort as algorithm runs gap is reduced. the last
	 * gap value is always 1.
	 * 
	 * In place algorithm
	 * complexity depends on gap. worst case is O(n^2)
	 * Unstable algorithm
	 */
	public static boolean isPrint = true;
	
	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		intArray = shellSorting(intArray);
		
		System.out.print("Sorted Array => ");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] shellSorting(int[] intArray) {
		int cnt = 0;
		for(int gap=intArray.length/2 ; gap>0 ; gap = gap/2) {
			
			for(int i=gap; i<intArray.length;i++) {
				int newElement = intArray[i];
				int j=i;
				
				while(j>=gap && intArray[j-gap] > newElement) {
					intArray[j] = intArray[j-gap] ;
					j = j-gap;
				}
				
				intArray[j] = newElement;
			}
			

			if(isPrint) {
				System.out.println("Iteration "+ cnt);
				for (int el : intArray) {
					System.out.print(el+" ");
				}
				cnt++;
				System.out.println();
			}
		}
		
		return intArray;
	}

}
