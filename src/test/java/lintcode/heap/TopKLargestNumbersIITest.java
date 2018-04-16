package lintcode.heap;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TopKLargestNumbersIITest {
	@Test
	public void shouldGetTopKLargestNumbersByPriorityQueue() {
		// given
		int k = 3;
		int i1 = 3;
		int i2 = 10;
		int i3 = 1000;
		int i4 = -99;
		int i5 = 4;
		int i6 = 100;
		Integer[] expecteds1 = { 10, 3 };
		Integer[] expecteds2 = { 1000, 10, 3 };
		Integer[] expecteds3 = { 1000, 10, 4 };
		Integer[] expecteds4 = { 1000, 100, 10 };
		TopKLargestNumbersII topKLargestNumbersII = new TopKLargestNumbersII(k);

		// when case 1
		topKLargestNumbersII.add(i1);
		topKLargestNumbersII.add(i2);
		List<Integer> result1 = topKLargestNumbersII.topk();
		// then case 1
		Assert.assertEquals(expecteds1, result1.toArray());

		// when case 2
		topKLargestNumbersII.add(i3);
		topKLargestNumbersII.add(i4);
		List<Integer> result2 = topKLargestNumbersII.topk();
		// then case 2
		Assert.assertEquals(expecteds2, result2.toArray());

		// when case 3
		topKLargestNumbersII.add(i5);
		List<Integer> result3 = topKLargestNumbersII.topk();
		// then case 3
		Assert.assertEquals(expecteds3, result3.toArray());

		// when case 4
		topKLargestNumbersII.add(i6);
		List<Integer> result4 = topKLargestNumbersII.topk();
		// then case 4
		Assert.assertEquals(expecteds4, result4.toArray());

	}
}
