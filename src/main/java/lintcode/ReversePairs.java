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
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					totalPairs++;
				}
			}
		}
		return totalPairs;
	}

	/**
	 * @param A:
	 *            an array
	 * @return: total of reverse pairs
	 */
	public long reversePairs(int[] A) {
		return mergeSort(A, 0, A.length - 1);
	}

	private long mergeSort(int[] A, int start, int end) {
		if (start >= end) {
			return 0;
		}

		int mid = (start + end) / 2;
		long sum = 0;
		sum += mergeSort(A, start, mid);
		sum += mergeSort(A, mid + 1, end);
		sum += merge(A, start, mid, end);
		return sum;
	}

	private long merge(int[] A, int start, int mid, int end) {
		int[] temp = new int[A.length];
		int leftIndex = start;
		int rightIndex = mid + 1;
		int index = start;
		long sum = 0;

		while (leftIndex <= mid && rightIndex <= end) {
			if (A[leftIndex] <= A[rightIndex]) {
				temp[index++] = A[leftIndex++];
			} else {
				temp[index++] = A[rightIndex++];
				sum += mid - leftIndex + 1;
			}
		}
		while (leftIndex <= mid) {
			temp[index++] = A[leftIndex++];
		}
		while (rightIndex <= end) {
			temp[index++] = A[rightIndex++];
		}

		for (int i = start; i <= end; i++) {
			A[i] = temp[i];
		}

		return sum;
	}

	public static void main(String[] args) throws IOException {
		ReversePairs rp = new ReversePairs();
		int[] numbers = { 2, 4, 1, 3, 5 };
		int[] duplicatedNumbers = numbers;
		System.out.println(" Total Reverse Pairs: " + rp.getReversePairs(numbers));
		System.out.printf(" Total Reverse Pairs with Merge sort: " + rp.reversePairs(duplicatedNumbers));

	}
}
