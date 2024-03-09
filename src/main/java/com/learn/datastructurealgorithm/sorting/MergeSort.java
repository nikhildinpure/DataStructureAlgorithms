package com.learn.datastructurealgorithm.sorting;

public class MergeSort {
	
	/*
	 * Divide and conquer algo
	 * Recursive 
	 * logical Splitting and merging
	 * 
	 */

	
	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		intArray = mergeSort(intArray);
		
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] mergeSort(int[] intArray) {
		
		sort(intArray,0,intArray.length-1);
		
		return intArray;
	}
		
	public static void sort(int[] intArray, int start,int end) {
		int mid = (end+start)/2;
		
		if((end-start) < 2) {
			System.out.println("array of lenght 1");
			return;
		}
		
		System.out.println("left Side ====");
		sort(intArray,start,mid);
		
		System.out.println("Right Side ====");
		sort(intArray,mid,end);
		
		merge(intArray,start,mid,end);
		
	}
	
	public static void merge(int[] intArray, int start,int mid, int end) {
		System.out.println("Merging ======");
		//{20, 35, -15, 7, 55, 1, -22};
		if(intArray[mid-1] <= intArray[mid]) {
			System.out.println("already sorted ======");
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIdx = 0;
		int[] tempArr = new int[end-start];
		
		while(i < mid && j < end) {
			if(intArray[i] < intArray[j]) {
				tempArr[tempIdx] = intArray[i];
				i++;
			}else {
				tempArr[tempIdx] = intArray[j];
				j++;
			}
			tempIdx++;
		}
		
		System.arraycopy(intArray,i,intArray,start+tempIdx,mid-i);
		System.arraycopy(tempArr, 0, intArray, start, tempIdx);
		
		
	}
}
