package com.poac.csu.sort;

public class CountSort {
	
	// from small to big
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };
	
	public static int getMaxNum() {
		
		int max = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}
		return max;
	}
	
	
	public static int getMinNum() {

		int min = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (min > intArray[i]) {
				min = intArray[i];
			}
		}
		return min;
	}
	
	
	
	public static void contSort() {
		
		int max = getMaxNum();
		int min = getMinNum();

		int n = max - min + 1;
		int[] countArray = new int[n];
		for (int i = 0; i < intArray.length; i++) {
			int currentNum = intArray[i];
			
			countArray[currentNum - min]++;
		}

		int i = 0, index = 0;

		while (i < countArray.length ) {			
			if( countArray[i] != 0) {
				if (countArray[i] > 1) {
					for (int k = 0; k < countArray[i]; k++) {
						index += 1;
						intArray[index -1 ] = i + min;
					}
				} else {
					index += 1;
					intArray[index -1 ] = i + min;
				}				
			}
			i++;		
		}

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		contSort();

		System.out.println("-------------after----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	}

}
