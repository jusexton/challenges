package com.sexton.leetcode;

public final class SearchInsert {
	/**
	 * Binary search implementation. Instead of returning -1 when a value is not found
	 * the index at which the element should be placed is returned.
	 *
	 * @param numbers The sorted array to search.
	 * @param number  The number to search for.
	 * @return The index of the found element or index of where the not found element should be.
	 */
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
