package com.poac.csu.sort;

public class SelectionSort {
	
	// from small to big 
	public static int[] intArray = new int[] {100,21,33,55,76,89,23,57,88,34,102,23,35,57,78,91,25,59,90,36,22,77};
		

	public static void selectionSort() {			
		int temp = 0;
		for(int i = 0; i < intArray.length; i++) {			
			int minIndex = i;
			for(int j = i + 1; j < intArray.length; j++) {
				if(intArray[minIndex] > intArray[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				temp = intArray[minIndex];
				intArray[minIndex] = intArray[i];
				intArray[i] = temp;		
			}				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------before----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		selectionSort();
		
		System.out.println("-------------after----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

}
