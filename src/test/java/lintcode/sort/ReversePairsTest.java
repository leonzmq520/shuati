package lintcode.sort;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ReversePairsTest {
	@Test
	public void shouldGetReversePairsByMergeSort() {
		// given
		ReversePairs reversePairs = new ReversePairs();
		int[] numbers = { 2, 4, 1, 3, 5 };
		long expected = 3;

		// when
		long result = reversePairs.reversePairs(numbers);

		// then
		Assert.assertEquals(expected, result);
	}
}
