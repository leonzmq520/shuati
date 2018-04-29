package lintcode.array;

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
