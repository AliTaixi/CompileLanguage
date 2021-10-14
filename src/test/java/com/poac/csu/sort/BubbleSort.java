package com.poac.csu.sort;

public class BubbleSort {
	
	// from small to big 
	public static int[] intArray = new int[] {100,21,33,55,76,89,23,57,88,34,102,23,35,57,78,91,25,59,90,36,22,77};
	
	// bubble sort
	public static void bubleSort() {
		for(int i = 0; i < intArray.length - 1 ; i++) {
			for(int j = 0; j < intArray.length - i - 1 ; j++) {
				if(intArray[j] > intArray[j+1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
				}
			}
		}		
	}
	
	static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
	
	static void callBubbleSort() {

		System.out.println("-------------before----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		bubleSort();
		
		System.out.println("-------------after----------");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		// no change
		int a = 10, b = 20;
        swap(a,b);
        System.out.println(b);
	
	}
	
	public static void main(String[] args) {
		callBubbleSort();
	}

}
