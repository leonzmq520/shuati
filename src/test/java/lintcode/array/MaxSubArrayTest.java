package lintcode.array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxSubArrayTest {
	@Test
	public void shouldGetMaxSubArrayTest() {
		// given
		MaxSubArray maxSubArray = new MaxSubArray();
		int[] digits = { -2, 2, -3, 4, -1, 2, 1, -5, 3 };
		int expected = 6;

		// when
		int results = maxSubArray.getMaxSubArraySum(digits);

		// then
		Assert.assertEquals(results, expected);
	}
}
