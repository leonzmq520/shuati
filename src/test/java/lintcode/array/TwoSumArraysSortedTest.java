package lintcode.array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumArraysSortedTest {
	@Test
	public void shouldGetTwoSum() {
		// given
		TwoSumArraysSorted twoSumArraySorted = new TwoSumArraysSorted();
		int[] numbers = { 2, 7, 11, 15 };
		int target = 17;
		int[] expecteds = { 1, 4 };

		// when
		int[] results = twoSumArraySorted.twoSum(numbers, target);

		// then
		Assert.assertEquals(expecteds, results);
	}
}
