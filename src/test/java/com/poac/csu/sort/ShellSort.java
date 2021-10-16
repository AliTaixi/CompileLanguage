package com.poac.csu.sort;

/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-16 17:26:08
 */
public class ShellSort {
	
	// from small to big 
	public static int[] intArray = new int[] {100,21,33,55,76,89,23,57,88,34,102,23,35,57,78,91,25,59,90,36,22,77};
			
	// shell sort 
	public static void shellSort() {
		
		for (int stepLength = intArray.length / 2; stepLength > 0; stepLength /= 2) {

			for (int j = 0; j <= intArray.length/stepLength; j++) {
				for (int i = 0; i < intArray.length; i += stepLength) {

					if (i - stepLength >= 0 && intArray[i] < intArray[i - stepLength]) {

						int temp = intArray[i];
						intArray[i] = intArray[i - stepLength];
						intArray[i - stepLength] = temp;

					}

				}
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
		
		shellSort();
		
		System.out.println("-------------after----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
	}

}
