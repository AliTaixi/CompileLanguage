package com.poac.csu.sort;

/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-16 17:25:56
 */
public class MergeSort {

	// from small to big
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };

	// merge sort
	static void merge(int left, int right, int[] temp) {

		if (left < right) {
			int mid = (left + right) / 2;
			merge(left, mid, temp);
			merge(mid + 1, right, temp);
//			System.out.println("left:" + left + " mid:" + mid + " right:" + right);
			sort(left, mid, right, temp);
		}

	}

	/**
	 * 
	 * @param left
	 * @param mid
	 * @param right
	 */
	static void sort(int left, int mid, int right, int[] temp) {
//		if(left == mid) {
//			if(intArray[left] > intArray[right]) {
//				temp[left] = intArray[right];
//				temp[right] = intArray[left];
//			}else {
//				temp[left] = intArray[left];
//				temp[mid] = intArray[mid];
//				temp[right] = intArray[right];
//			}
//		}else {
//			int t = mid;
//			while(left < t ) {
//				if (intArray[left] > intArray[mid + 1]) {
//					temp[left] = intArray[mid + 1];
//					mid++;
//				}
//				left++;
//			}
//		}

		int i = left, j = mid + 1, t = right;
		int k = 0;
		while (i <= mid && j <= right) {

			if (intArray[i] > intArray[j]) {
				temp[k++] = intArray[j++];
			} else {
				temp[k++] = intArray[i++];
			}

		}
		System.out.println("ceshi i:" + i + " ceshi j:" + j + " ceshi k:" + k);
		while (i <= mid) {
			temp[k++] = intArray[i++];
		}
		while (j <= right) {
			temp[k++] = intArray[j++];
		}
		k = 0;
		while (left <= right) {
			intArray[left++] = temp[k++];
		}
	}

	static void mergeSort() {
		int[] temp = new int[intArray.length];
		merge(0, intArray.length - 1, temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println();

		mergeSort();

		System.out.println("-------------after----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		int i = 0;
		int j = 0;
		System.out.println("i++=:" + (i++) + " ++j=:" + (++j));

	}

}
