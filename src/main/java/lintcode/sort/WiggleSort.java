package lintcode.sort;

import java.io.IOException;

/**
 * 508. Wiggle Sort
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 40%
 * 
 * Given an unsorted array nums, reorder it in-place such that
 * 
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * 
 * 
 * 
 * Example:
 * 
 * Given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 * 
 * 
 * 
 * Tags: Array Quick Sort Sort Google
 * 
 * @author fakezmq
 *
 */
public class WiggleSort {
	/*
	 * Solution:
	 * 偶数位要小，奇数位要大。遍历数组，若走到偶数位时，若其大于前一位数，则和前一位交换；若走到奇数位，若其比前一位要小，则和前一位交换。
	 * 
	 * @param nums: A list of integers
	 * 
	 * @return: nothing
	 */
	public void wiggleSort(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}
		for (int i = 1; i < nums.length; i++) {
			if (i % 2 == 0 && nums[i] > nums[i - 1] || (i % 2 == 1 && nums[i] < nums[i - 1])) {
				int temp = nums[i - 1];
				nums[i - 1] = nums[i];
				nums[i] = temp;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		WiggleSort ws = new WiggleSort();
		int[] numbers = { 3, 5, 2, 1, 6, 4 };
		ws.wiggleSort(numbers);
		System.out.printf("result: [");
		for (int number : numbers) {
			System.out.printf(" " + number);
		}
		System.out.printf(" ]");
	}
}
