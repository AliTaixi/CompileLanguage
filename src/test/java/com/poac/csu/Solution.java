package com.poac.csu;

public class Solution {

	public static int[] intArray = new int[] { 2, 1, 2, 3, 2, 1, 2, 3 };

	public static int majorityElement(int[] nums) {

		int candidate = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (candidate == nums[i]) {
				count++;
			} else {
				count--;
				if (count == 0 && i != nums.length - 1) {
					candidate = nums[i];
					count = 1;
				}
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(intArray));

	}

}
