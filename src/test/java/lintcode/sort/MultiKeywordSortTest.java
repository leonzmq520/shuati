package lintcode.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiKeywordSortTest {

	@Test
	public void shouldGetMultiKeywordSortTest() {
		// given
		MultiKeywordSort multiKeywordSort = new MultiKeywordSort();
		int[][] InputGrads = { { 2, 50 }, { 1, 50 }, { 3, 100 } };
		int[][] expected = { { 3, 100 }, { 1, 50 }, { 2, 50 } };

		// when
		int[][] actual = multiKeywordSort.getGradesByMultiKeyword(InputGrads);

		// then
		Assert.assertEquals(actual, expected);

	}
}
