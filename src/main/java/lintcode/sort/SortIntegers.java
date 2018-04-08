package lintcode.sort;

/**
 * 463. Sort Integers
 * 
 * Difficulty: Naive
 * 
 * Accepted Rate: 33%
 * 
 * Given an integer array, sort it in ascending order. Use selection sort,
 * bubble sort, insertion sort or any O(n2) algorithm.
 * 
 * 
 * 
 * Example:
 * 
 * Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
 * 
 * 
 * 
 * Tags: Sort
 * 
 * @author fakezmq
 *
 */
public class SortIntegers {
	/**
	 * @param A:
	 *            an integer array
	 * @return: nothing
	 */
	public void bubbleSort(int[] A) {
		int temp = 0, len = A.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
	}
}
