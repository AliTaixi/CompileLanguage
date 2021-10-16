package com.poac.csu.sort;
/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-16 17:25:56
 */
public class MergeSort {
	
	// from small to big 
	public static int[] intArray = new int[] {100,21,33,55,76,89,23,57,88,34,102,23,35,57,78,91,25,59,90,36,22,77};
	
	
	static void mergeSort(int[] mergeArray) {
		
	
	}
	
	static void sort() {
		
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
