package lintcode.array;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 608. Two Sum - Input array is sorted (Amazon)
 * 
 * Difficulty:Medium
 * 
 * Accepted Rate: 47%
 * 
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * Notice You may assume that each input would have exactly one solution.
 * 
 * 
 * 
 * Example :
 * 
 * Given nums = [2, 7, 11, 15], target = 9 return [1, 2]
 * 
 * 
 * 
 * Tags : Array Hash Table Amazon Two Pointers
 * 
 * @author fakezmq
 *
 */
public class TwoSumArraysSorted {
	/*
	 * @param nums: an array of Integer
	 * 
	 * @param target: target = nums[index1] + nums[index2]
	 * 
	 * @return: [index1 + 1, index2 + 1] (index1 < index2)
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i + 1 };
			}
			map.put(nums[i], i + 1);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) throws IOException {
		TwoSumArraysSorted tsas = new TwoSumArraysSorted();
		int[] numbers = { 2, 7, 11, 15 };
		int target = 17;
		int[] result = new int[2];
		result = tsas.twoSum(numbers, target);
		System.out.printf("[" + result[0] + ", " + result[1] + "]");

	}
}
