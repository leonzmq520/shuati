package lintcode.heap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TopKLargestNumbersTest {
	@Test
	public void shouldGetTopKLargestNumbersByPriorityQueue() {
		// given
		TopKLargestNumbers topKLargestNumbers = new TopKLargestNumbers();
		int[] numbers = { 3, 10, 1000, -99, 4, 100 };
		int[] expecteds = { 1000, 100, 10 };
		int k = 3;

		// when
		int[] result = topKLargestNumbers.topk(numbers, k);

		// then
		Assert.assertEquals(expecteds, result);
	}
}
