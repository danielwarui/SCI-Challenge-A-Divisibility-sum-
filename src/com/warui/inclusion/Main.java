package com.warui.inclusion;

public class Main {
	long bot;
	static int i;
	static int ans;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		for (i = 0; i < 10000; ++i) {
			if (i % 7 == 0 || i % 11 == 0) {
				System.out.println(" " + i + "\n");
				ans += i;
				System.out.println(" " + ans);
			}

		}
		System.out.println("\n\nFinally here is the Sum  " + ans);
	}

}
