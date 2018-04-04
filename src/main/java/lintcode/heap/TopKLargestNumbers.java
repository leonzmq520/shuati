package lintcode.heap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 544. Top k Largest Numbers
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 35%
 * 
 * Given an integer array, find the top k largest numbers in it.
 * 
 * 
 * Example:
 * 
 * Given [3,10,1000,-99,4,100] and k = 3. Return [1000, 100, 10].
 * 
 * 
 * 
 * Tags: Heap Priority Queue
 * 
 * @author fakezmq
 *
 */
public class TopKLargestNumbers {
	/**
	 * @param nums:
	 *            an integer array
	 * @param k:
	 *            An integer
	 * @return: the top k largest numbers in array
	 */
	public int[] getTopk(int[] nums, int k) {
		List<Integer> results = new ArrayList<Integer>();
		if (nums == null || nums.length < 0 || k < 0 || nums.length < k) {
			return convertIntegers(results);
		}

		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= nums.length - k; i--) {
			results.add(nums[i]);
		}

		return convertIntegers(results);
	}

	/**
	 * Integer ArrayList convert to primitive int array
	 * 
	 * @param integers
	 *            An Integer ArrayList
	 * @return ret A primitive int array integer array
	 */
	private int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		Iterator<Integer> iterator = integers.iterator();
		for (int i = 0; i < ret.length; i++) {
			ret[i] = iterator.next().intValue();
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {
		TopKLargestNumbers topk = new TopKLargestNumbers();
		int[] numbers = { 3, 10, 1000, -99, 4, 100 };
		int k = 3;
		System.out.printf("[");
		for (int number : topk.getTopk(numbers, k)) {
			System.out.printf(" " + number);
		}
		System.out.printf("]");
	}
}
