package lintcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 402. Continuous Subarray Sum
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 26%
 * 
 * Given an integer array, find a continuous subarray where the sum of numbers
 * is the biggest. Your code should return the index of the first number and the
 * index of the last number. (If their are duplicate answer, return anyone)
 * 
 * 
 * 
 * Example:
 * 
 * Give [-3, 1, 3, -3, 4], return [1,4].
 * 
 * 
 * 
 * Tags: Subarray Array Facebook
 * 
 * Ref: https://en.wikipedia.org/wiki/Maximum_subarray_problem
 * 
 * @author fakezmq
 *
 */
public class MaxContinuousSubarraySum {
	/*
	 * @param A: An integer array
	 * 
	 * @return: A list of integers includes the index of the first number and
	 * the index of the last number
	 */
	public List<Integer> getMaxcontinuousSubarraySum(int[] A) {
		ArrayList<Integer> sums = new ArrayList<>();
		if (A == null || A.length == 0) {
			return sums;
		}
		sums.addAll(Arrays.asList(0, 0));

		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		int start = 0;
		int end = 0;

		for (int i = 0; i < A.length; i++) {
			if (currentSum < 0) {
				currentSum = A[i];
				start = end = i;
			} else {
				currentSum += A[i];
				end = i;
			}
			if (currentSum >= sum) {
				sum = currentSum;
				sums.set(0, start);
				sums.set(1, end);
			}
		}
		return sums;
	}
}
