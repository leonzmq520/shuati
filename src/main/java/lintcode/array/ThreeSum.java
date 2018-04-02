package lintcode.array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 57. 3Sum
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 20%
 * 
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * 
 * 
 * Notice:
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤
 * c)
 * 
 * The solution set must not contain duplicate triplets.
 * 
 * 
 * 
 * Example:
 * 
 * For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:
 * 
 * (-1, 0, 1) (-1, -1, 2)
 * 
 * 
 * 
 * Tags: Facebook Sort Two Pointers Array Microsoft Amazon Bloomberg Adobe Works
 * Applications
 * 
 * @author fakezmq
 *
 */
public class ThreeSum {
	/**
	 * @param numbers:
	 *            Give an array numbers of n integer
	 * @return: Find all unique triplets in the array which gives the sum of
	 *          zero.
	 */
	public List<List<Integer>> threeSum(int[] numbers) {
		List<List<Integer>> results = new ArrayList<>();
		if (numbers == null || numbers.length < 3) {
			return results;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 2; i++) {
			// skip duplicate triples with the same first numeber
			if (i > 0 && numbers[i] == numbers[i - 1]) {
				continue;
			}
			int left = i + 1, right = numbers.length - 1;
			int target = -numbers[i];
			twoSum(numbers, left, right, target, results);
		}
		return results;
	}

	private void twoSum(int[] numbers, int left, int right, int target, List<List<Integer>> results) {
		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				ArrayList<Integer> triple = new ArrayList<>();
				triple.add(-target);
				triple.add(numbers[left]);
				triple.add(numbers[right]);
				results.add(triple);
				left++;
				right--;
				// skip duplicate pairs with the same left
				while (left < right && numbers[left] == numbers[left - 1]) {
					left++;
				}
				// skip duplicate pairs with the same right
				while (left < right && numbers[right] == numbers[right + 1]) {
					right--;
				}
			} else if (numbers[left] + numbers[right] < target) {
				left++;
			} else {
				right--;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ThreeSum ts = new ThreeSum();
		int[] numbers = { -2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5 };
		List<List<Integer>> results = ts.threeSum(numbers);
		System.out.printf("result: [");
		for (List<Integer> result : results) {
			System.out.printf(" [");
			for (int number : result) {
				System.out.printf(" " + number);
			}
			System.out.printf(" ]");
		}
		System.out.printf(" ]");

	}
}
