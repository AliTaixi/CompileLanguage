package com.poac.csu.dp;

/**
 * 
 * @author Power
 * @comment -- etc.
 * @date 2021-12-18 17:51:45
 */
public class UniquePath {

	/**
	 * 给定m行n列的网格， 有一个机器人从左上角（0,0）出发，每一步可以向下或者向右走一步， 问有多少种不同的方式走到右下角。
	 */

	/**
	 * f(m,n) = f(m,n-1)+f(m-1,n); f(0,0) = 0; f(0,n) = 1; f(m,0) = 1;
	 */
	public static int dp(int m, int n) {

		int[][] f = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					f[i][j] = 1;
				} else {
					f[i][j] = f[i][j - 1] + f[i][j - 1];
				}
			}
		}

		return f[m - 1][n - 1];
	}

	public static void main(String args[]) {
		System.out.println(dp(4, 8));
	}

}
