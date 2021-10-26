package com.poac.csu.sort;

/**
 * quick sort
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-25 10:02:18
 */
public class QuikSort {

	// from small to big
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };

	public static void quickSort(int start, int end) {
		int istart = start;
		int iend = end;
		int temp = intArray[istart];

		while (istart < iend) {
			while (temp < intArray[iend] && istart < iend) {
				iend--;
			}
			intArray[istart] = intArray[iend];

			while (temp >= intArray[istart] && istart < iend) {
				istart++;
			}
			intArray[iend] = intArray[istart];
		}

		if (start < end) {
			intArray[istart] = temp;
			quickSort(start, istart - 1);
			quickSort(istart + 1, end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		quickSort(0, intArray.length - 1);

		System.out.println("-------------after----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	}

}
