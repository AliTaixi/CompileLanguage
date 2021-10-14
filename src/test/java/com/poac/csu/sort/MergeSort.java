package com.poac.csu.sort;

public class MergeSort {
	
	// from small to big 
	public static int[] intArray = new int[] {100,21,33,55,76,89,23,57,88,34,102,23,35,57,78,91,25,59,90,36,22,77};
	
	
	static void mergeSort(int[] mergeArray) {
		
		if (mergeArray.length == 2) {
			if (mergeArray[0] > mergeArray[1]) {

				int temp = mergeArray[0];
				mergeArray[0] = mergeArray[1];
				mergeArray[1] = temp;

			}
		}else {
//			mergeSort(mergeArray[]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------before----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		mergeSort(intArray);
		
		System.out.println("-------------after----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
	}

}
