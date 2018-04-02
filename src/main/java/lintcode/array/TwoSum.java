package lintcode.array;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 56.Two Sum (Airbnb, Facebook, frequently asked question ++)
 * 
 * Difficulty:Easy
 * 
 * Accepted Rate: 28%
 * 
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are zero-based.
 * 
 * Notice You may assume that each input would have exactly one solution
 * 
 * 
 * 
 * Example :
 * 
 * numbers=[2, 7, 11, 15], target=9 return [0, 1]
 * 
 * numbers=[1, 0, -1], target=-1 return [1, 2]
 * 
 * 
 * 
 * Challenge :
 * 
 * Either of the following solutions are acceptable:
 * 
 * O(n) Space, O(nlogn) Time
 * 
 * O(n) Space, O(n) Time
 * 
 * 
 * 
 * Tags: Sort Hash Table Airbnb Array Facebook Two Pointers
 * 
 * @author fakezmq
 *
 */
public class TwoSum {
	/**
	 * @param numbers:
	 *            An array of Integer
	 * @param target:
	 *            target = numbers[index1] + numbers[index2]
	 * @return: [index1 , index2 ] (index1 < index2)
	 */
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(numbers[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) throws IOException {
		TwoSum ts = new TwoSum();
		int[] numbers = { 1, 0, -1 };
		int target = -1;
		int[] result = new int[2];
		result = ts.twoSum(numbers, target);
		System.out.printf("[" + result[0] + ", " + result[1] + "]");

	}
}
