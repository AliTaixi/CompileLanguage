package com.poac.csu.greedy;

/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-12-04 15:07:59
 */

public class Greedy {
	/**
	 * [找零钱问题]假如老板要找给我99分钱，他有上面的面值分别为25，10，5，1的硬币数，求最少的硬币数.		
	 */
	
	public static int greedy(int total) {
		int minNum = 0;
		int[] demominations = new int[] { 25, 10, 5, 1 };
		int[] number = new int[demominations.length];
		
		
		
		for (int i = 0; i < demominations.length; i++) {
			number[i] = total / demominations[i];
			total = total % demominations[i];
			minNum +=number[i];
		}
		
//		for (int i = 0; i < demominations.length; i++) {
//			System.out.println("need demominations " + demominations[i] + " number : " + number[i]);
//		}	
		return minNum;
	}
	
	
	/**
	 * f(99) = min{f(74),f(89),f(94),f(98)}
	 * f(25),f(10),f(5),f(1) = 1;
	 * @param args
	 */
	
	public static int dp(int res) {
		int[] demominations = new int[] { 25, 10, 5, 1 };
		int[] f = new int[res + 1];

		f[0] = 0;

		for (int i = 1; i <= res; i++) {
			f[i] = Integer.MAX_VALUE;
			for (int j = 0; j < demominations.length; j++) {

				if (i >= demominations[j] && f[i - demominations[j]] != Integer.MAX_VALUE) {
					f[i] = Math.min(f[i], f[i - demominations[j]] + 1);
				}
			}
		}
		if (f[res] == Integer.MAX_VALUE) {
			f[res] = -1;
		}

		return f[res];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			if (greedy(i) != dp(i)) {
				System.out.println(" greedy algorithm min coin number is : " + greedy(i));
				System.out.println(" dp algorithm min coin number is : " + dp(i));
			}
		}		

	}

}
