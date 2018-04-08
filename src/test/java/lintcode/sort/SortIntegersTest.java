package lintcode.sort;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SortIntegersTest {
	@Test
	public void shouldGetBubbleSort() {
		// given
		SortIntegers sortIntegers = new SortIntegers();
		int[] numbers = { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };
		int[] expecteds = { 3, 5, 9, 22, 32, 34, 35, 37, 50, 55, 64, 70, 82, 89 };

		// when
		sortIntegers.bubbleSort(numbers);

		// then
		Assert.assertArrayEquals(expecteds, numbers);
	}
}
