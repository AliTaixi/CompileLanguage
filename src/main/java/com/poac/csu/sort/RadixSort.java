package com.poac.csu.sort;

/**
 * Radix Sort Algorithm
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-11-10 19:41:55
 */
public class RadixSort {

	// from small to big
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };

	public static int getMaxNum() {
		int max = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}
		return max;
	}

	public static void radixSort() {
		int maxNum = getMaxNum();
		int base = 1; // base number
		int[] arrCpy = new int[intArray.length];

		System.arraycopy(intArray, 0, arrCpy, 0, intArray.length);
		System.out.println("-------------before1----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(arrCpy[i] + " ");
		}
		System.out.println();

		int[] tempArray = new int[intArray.length];
		while (maxNum / base > 0) {

			int[] bucket = new int[10];

			for (int i = 0; i < intArray.length; i++) {
				bucket[(intArray[i] / base) % 10]++;
			}

			for (int j = 1; j < 10; j++) {
				bucket[j] += bucket[j - 1];
			}

			for (int i = intArray.length - 1; i > 0; i--) {
				tempArray[bucket[(arrCpy[i] / base) % 10] - 1] = arrCpy[i];
				bucket[(arrCpy[i] / base) % 10]--;

			}

			base *= 10;
			System.arraycopy(tempArray, 0, arrCpy, 0, intArray.length);
		}
		System.arraycopy(arrCpy, 0, intArray, 0, intArray.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		radixSort();

		System.out.println("-------------after +----------" + "------------------------------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	}

}
