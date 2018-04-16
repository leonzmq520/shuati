package lintcode.array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOneTest {
	@Test
	public void shouldGetPlusOneArray() {
		// given
		PlusOne plusOne = new PlusOne();
		int[] digits = { 9, 9, 9 };
		int[] expected = { 1, 0, 0, 0 };

		// when
		int[] results = plusOne.getPlusOne(digits);

		// then
		Assert.assertEquals(results, expected);
	}
}
