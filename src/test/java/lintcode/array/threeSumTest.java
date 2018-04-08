package lintcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

public class threeSumTest {
	@Test
	public void shouldGetThreeSum() {
		// given
		ThreeSum threeSum = new ThreeSum();
		int[] numbers = { -2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5 };
		List<List<Integer>> expecteds = new ArrayList<>();
		List<Integer> triple0 = new ArrayList<>();
		List<Integer> triple1 = new ArrayList<>();
		List<Integer> triple2 = new ArrayList<>();
		List<Integer> triple3 = new ArrayList<>();
		List<Integer> triple4 = new ArrayList<>();
		List<Integer> triple5 = new ArrayList<>();
		List<Integer> triple6 = new ArrayList<>();
		List<Integer> triple7 = new ArrayList<>();
		List<Integer> triple8 = new ArrayList<>();
		List<Integer> triple9 = new ArrayList<>();
		List<Integer> triple10 = new ArrayList<>();
		List<Integer> triple11 = new ArrayList<>();
		List<Integer> triple12 = new ArrayList<>();
		List<Integer> triple13 = new ArrayList<>();
		List<Integer> triple14 = new ArrayList<>();

		Integer[] t0 = { -11, 4, 7 };
		Integer[] t1 = { -7, 2, 5 };
		Integer[] t2 = { -7, 3, 4 };
		Integer[] t3 = { -5, -2, 7 };
		Integer[] t4 = { -5, 1, 4 };
		Integer[] t5 = { -5, 2, 3 };
		Integer[] t6 = { -4, -3, 7 };
		Integer[] t7 = { -4, -1, 5 };
		Integer[] t8 = { -4, 1, 3 };
		Integer[] t9 = { -3, -2, 5 };
		Integer[] t10 = { -3, -1, 4 };
		Integer[] t11 = { -3, 1, 2 };
		Integer[] t12 = { -2, -2, 4 };
		Integer[] t13 = { -2, -1, 3 };
		Integer[] t14 = { -1, -1, 2 };

		triple0.addAll(Arrays.asList(t0));
		triple1.addAll(Arrays.asList(t1));
		triple2.addAll(Arrays.asList(t2));
		triple3.addAll(Arrays.asList(t3));
		triple4.addAll(Arrays.asList(t4));
		triple5.addAll(Arrays.asList(t5));
		triple6.addAll(Arrays.asList(t6));
		triple7.addAll(Arrays.asList(t7));
		triple8.addAll(Arrays.asList(t8));
		triple9.addAll(Arrays.asList(t9));
		triple10.addAll(Arrays.asList(t10));
		triple11.addAll(Arrays.asList(t11));
		triple12.addAll(Arrays.asList(t12));
		triple13.addAll(Arrays.asList(t13));
		triple14.addAll(Arrays.asList(t14));
		expecteds.addAll(Arrays.asList(triple0, triple1, triple2, triple3, triple4, triple5, triple6, triple7, triple8,
				triple9, triple10, triple11, triple12, triple13, triple14));

		// when
		List<List<Integer>> results = threeSum.threeSum(numbers);

		// then
		Assert.assertArrayEquals(expecteds.toArray(), results.toArray());
	}
}
