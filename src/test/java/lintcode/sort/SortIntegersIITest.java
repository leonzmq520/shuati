package lintcode.sort;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SortIntegersIITest {
	@Test
	public void shouldGetMergeSort() {
		// given
		SortIntegersII sortIntegersII = new SortIntegersII();
		int[] numbers = { 19, -10, -2, 40, 3, 36, 57, 25, 66, 51, 5, 40, -8, 43, 9, -5, 0, 4, 55, 28, 63, 67, -2, 35,
				57, 0, 0, 30, 17, 55, 22, 34, -4, 42, 57, 52, 4, 65, 6, -2, 8, 12, 31, 43, 26, 34, 31, 19, -3, 36, 34,
				11, 58, 23, 13, 7, 17, 10, 33, -5, 10, 53, 14, 56, 18, 8, -6, -2, 37, 7 };
		int[] expecteds = { -10, -8, -6, -5, -5, -4, -3, -2, -2, -2, -2, 0, 0, 0, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 10, 10,
				11, 12, 13, 14, 17, 17, 18, 19, 19, 22, 23, 25, 26, 28, 30, 31, 31, 33, 34, 34, 34, 35, 36, 36, 37, 40,
				40, 42, 43, 43, 51, 52, 53, 55, 55, 56, 57, 57, 57, 58, 63, 65, 66, 67 };

		// when
		sortIntegersII.mergeSort(numbers);

		// then
		Assert.assertArrayEquals(expecteds, numbers);
	}
	
	@Test
	public void shouldGetQuickSort() {
		// given
		SortIntegersII sortIntegersII = new SortIntegersII();
		int[] numbers = { 19, -10, -2, 40, 3, 36, 57, 25, 66, 51, 5, 40, -8, 43, 9, -5, 0, 4, 55, 28, 63, 67, -2, 35,
				57, 0, 0, 30, 17, 55, 22, 34, -4, 42, 57, 52, 4, 65, 6, -2, 8, 12, 31, 43, 26, 34, 31, 19, -3, 36, 34,
				11, 58, 23, 13, 7, 17, 10, 33, -5, 10, 53, 14, 56, 18, 8, -6, -2, 37, 7 };
		int[] expecteds = { -10, -8, -6, -5, -5, -4, -3, -2, -2, -2, -2, 0, 0, 0, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 10, 10,
				11, 12, 13, 14, 17, 17, 18, 19, 19, 22, 23, 25, 26, 28, 30, 31, 31, 33, 34, 34, 34, 35, 36, 36, 37, 40,
				40, 42, 43, 43, 51, 52, 53, 55, 55, 56, 57, 57, 57, 58, 63, 65, 66, 67 };

		// when
		sortIntegersII.quickSort(numbers);

		// then
		Assert.assertArrayEquals(expecteds, numbers);
	}
}
