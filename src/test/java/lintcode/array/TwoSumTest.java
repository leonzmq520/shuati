package lintcode.array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {
	@Test
	public void shouldGetTwoSum() {
		// given
		TwoSum twoSum = new TwoSum();
		int[] numbers = { 1, 0, -1 };
		int target =-1;
		int[] expecteds = { 1, 2 };

		// when
		int[] results = twoSum.twoSum(numbers, target);

		// then
		Assert.assertEquals(expecteds, results);
	}
}
