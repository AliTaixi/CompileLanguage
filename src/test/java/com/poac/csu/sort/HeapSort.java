package com.poac.csu.sort;

/**
 * Heap Sort Algorithm
 * 1.堆是一种数据结构
 * 2.堆是一颗完全二叉树，需要满足所有叶子节点都大于（或小于）他们的父节点
 * 构建堆：Heapify，的过程是找到完全二叉树中的一对父子节点，找到三个节点中的最大值交换到父节点的过程
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-10-26 20:41:39
 */
public class HeapSort {

	// small top heap
	public static int[] intArray = new int[] { 100, 21, 33, 55, 76, 89, 23, 57, 88, 34, 102, 23, 35, 57, 78, 91, 25, 59,
			90, 36, 22, 77 };

	int[] tempArray = new int[intArray.length];
	
	/**
	 * Heapify
	 * KEY POINT 1
	 * 找到一对子节点中的最大节点，
	 * 并交换到根节点的过程
	 *------------ 对于完全二叉树来说
	 * 给定父节点的位置n，可以找到其左叶子节点2n+1，和右叶子节点2n+2
	 */
	public static void heapify(int rootIndex) {

		// 假设根节点为最小值节点
		int min = rootIndex;
		int left = rootIndex * 2 + 1;
		int right = rootIndex * 2 + 2;

		// 判断根节点的值是否大于其左叶子节点，如果大于，min就赋值为左叶子位置
		if (left < intArray.length && intArray[rootIndex] > intArray[left]) {
			min = left;
		}

		// 判断根节点是否大于其右叶子节点，如果大于, min就赋值为右叶子位置
		if (right < intArray.length && intArray[min] > intArray[right]) {
			min = right;
		}
		
		//如果最小值不为跟节点，则交换
		if (min != rootIndex) {
			swap(rootIndex, min);
			heapify(min);
		}

	}

	/**
	 * 找到最后一个非叶子节点开始遍历和调整，直到跟
	 * 最后一个非叶子节点位置：length/2-1
	 */
	public static void createHeap() {
		int nonLeafPosition = (intArray.length)/2 -1;
		while (nonLeafPosition >= 0) {
			heapify(nonLeafPosition);
			nonLeafPosition--;
		}
	}
	
	/**
	 * heap sort algorithm
	 * KEY POINT 2
	 */
	public static void heapSort() {
		
		int i = 0, n = intArray.length;
		int[] arrayCpy = new int[n];
		
		while(i < n) {			
			createHeap();
			swap(0,n -i -1);
			arrayCpy[i] = intArray[n -i -1];
			int[] tempArray = new int[n -i -1];			
			System.arraycopy(intArray, 0, tempArray, 0, n -i -1);			
			intArray = tempArray;
			i++;
		}
		
		intArray = arrayCpy;
	}
	
	/**
	 * 交换数组中的两个元素
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------------before----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		heapSort();

		System.out.println("-------------after----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	
	}

	

}
