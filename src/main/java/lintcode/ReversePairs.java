package lintcode;

import java.io.IOException;

/**
 * 532. Reverse Pairs
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 23%
 * 
 * For an array A, if i < j, and A [i] > A [j], called (A [i], A [j]) is a
 * reverse pair. return total of reverse pairs in A.
 * 
 * 
 * 
 * Example:
 * 
 * Given A = [2, 4, 1, 3, 5] , (2, 1), (4, 1), (4, 3) are reverse pairs. return
 * 3
 * 
 *
 * Tag: Array Merge Sort Google
 * 
 * @author fakezmq
 *
 */
public class ReversePairs {
	/**
	 * @param A:
	 *            an array
	 * @return: total of reverse pairs
	 */
	public long getReversePairs(int[] A) {
		long totalPairs = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if (A[i] > A[j]) {
					totalPairs++;
				}
			}
		}
		return totalPairs;
	}

	public static void main(String[] args) throws IOException {
		ReversePairs rp = new ReversePairs();
		int[] numbers = { 2, 4, 1, 3, 5 };
		System.out.printf(" Total Reverse Pairs: " + rp.getReversePairs(numbers));

	}
}
