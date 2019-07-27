package com.sexton.leetcode;

public final class SearchInsert {
	public static int searchInsert(int[] numbers, int number) {
		if (numbers.length == 0) {
			return 0;
		}

		int left = 0;
		int right = numbers.length - 1;

		while (left <= right) {
			int middle = (int) Math.floor((left + right) / 2);
			if (numbers[middle] < number) {
				left = middle + 1;
				if (left > right) {
					return middle + 1;
				}
			} else if (numbers[middle] > number) {
				right = middle - 1;

				if (left > right) {
					return middle;
				}
			} else {
				return middle;
			}
		}

		throw new IllegalStateException("Function should never reach this point");
	}
}
