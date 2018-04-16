package lintcode.array;

/**
 * 407. Plus One
 * 
 * Difficulty:Easy
 * 
 * Accepted Rate: 31%
 * 
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * 
 * 
 * Example:
 * 
 * Given [1,2,3] which represents 123, return [1,2,4].
 * 
 * Given [9,9,9] which represents 999, return [1,0,0,0].
 * 
 * 
 * 
 * Tags: Array Google
 * 
 * @author fakezmq
 *
 */
public class PlusOne {
	/**
	 * @param digits:
	 *            a number represented as an array of digits
	 * @return: the result
	 */
	public int[] getPlusOne(int[] digits) {
		int n = digits.length;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] res = new int[n + 1];
		res[0] = 1;
		return res;
	}
}
