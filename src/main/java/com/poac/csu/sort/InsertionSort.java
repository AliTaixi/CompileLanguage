package com.poac.csu.sort;

/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-16 17:25:51
 */
public class InsertionSort {

	// from small to big
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };

	// insertion sort
	public static void insertionSort() {

		for (int i = 1; i < intArray.length; i++) {
			int temp = intArray[i];
			int flag = -1;
			for (int j = i; j > 0; j--) {
				if (temp < intArray[j - 1]) {
					intArray[j] = intArray[j - 1];
					flag = j - 1;
				}
			}
			if (flag != -1) {
				intArray[flag] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		insertionSort();

		System.out.println("-------------after----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

}
