package lintcode.sort;

import org.junit.Assert;
import org.testng.annotations.Test;

public class WiggleSortTest {
	@Test
	public void shouldGetWiggleSort() {
		// given
		WiggleSort wiggleSort = new WiggleSort();
		int[] numbers = { 3, 5, 2, 1, 6, 4 };
		int[] expecteds = {3, 5, 1, 6, 2, 4}; 

		// when
		wiggleSort.wiggleSort(numbers);

		// then
		Assert.assertArrayEquals(expecteds, numbers);
	}

}
