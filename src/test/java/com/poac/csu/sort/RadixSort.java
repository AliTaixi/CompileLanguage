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
		for (int i = 0; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}		
		return max;
	}
	
	public static void radixSort() {
		int maxNum = getMaxNum();
		int col = Integer.bitCount(maxNum);
		int[][] bucket = new int[col][10];
		
		int cout = 0;
		while (cout < intArray.length) {
			int elem = intArray[cout];
			while (elem > 0) {
				int numOfBit = elem % 10;

				elem /= 10;
			}

			cout++;
		}
		
		
		
	}
	
	
	/**
	 * unit 位数
	 * 1
	 * @param unit
	 */
	public void quickSort(int unit) {
		int[] bucket = new int[10];
		
		for(int i = 0; i < intArray.length; i++) {
			
		}
		
		
	}
	
	
	public static int getBitCode(int n) {
		int bitCode = 0;
		while (n / 10 > 0) {
			bitCode = n % 10;
		}
		return bitCode;
	}

	public static int getDecimal(int n) {
		int dec = 0;
		while (n / 10 > 0) {
			dec = n / 10;
		}
		return dec;
	}

	public static int getHundredth(int n) {
		int hund = 0;
		while (n / 100 > 0) {
			hund = n / 100;
		}
		return hund;
	}
	
	/**
	 * 交换数组位置
	 * @param i
	 * @param j
	 */
	public void swap(int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.bitCount(127));
	}

}
