package lintcode.array;

/**
 * 41. Maximum Subarray
 * 
 * Difficulty:Easy
 * 
 * Accepted Rate: 38%
 * 
 * Given an array of integers, find a contiguous subarray which has the largest
 * sum.
 *
 *
 *
 * Example:
 * 
 * Given the array [−2,2,−3,4,−1,2,1,−5,3], the contiguous subarray [4,−1,2,1]
 * has the largest sum = 6.
 * 
 * 
 * 
 * Challenge: Can you do it in time complexity O(n)?
 * 
 * 
 * 
 * Tags: LinkedIn Subarray Greedy LintCode Copyright Microsoft Bloomberg Array
 * Enumeration
 * 
 * 
 * 
 * @author fakezmq
 *
 */
public class MaxSubArray {
	/**
	 * @param nums:
	 *            A list of integers
	 * @return: An integer indicate the sum of max sub array
	 */
	public int getMaxSubArraySum(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int number : nums) {
			currentSum = Math.max(currentSum + number, number);
			sum = Math.max(sum, currentSum);
		}
		return sum;
	}
}
