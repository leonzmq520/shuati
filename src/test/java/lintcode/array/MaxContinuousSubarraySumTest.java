package lintcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxContinuousSubarraySumTest {
	@Test
	public void shouldGetMaxSubArrayTest() {
		// given
		MaxContinuousSubarraySum maxSubArray = new MaxContinuousSubarraySum();
		int[] digits = { 1, 2, -2, -100, 1, 2, -2 };
		List<Integer> expected = new ArrayList<>();
		// it test the duplicate case ( [0,1] or [4,5] )
		expected.addAll(Arrays.asList(0, 1, 4, 5));

		// when
		List<Integer> results = maxSubArray.getMaxcontinuousSubarraySum(digits);

		// then
		Assert.assertTrue(results.size() == 2);
		Assert.assertTrue(expected.containsAll(results));

	}
}
