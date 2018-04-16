package lintcode.string;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordBreakTest {
	@Test
	public void shouldBeAbleToBreakWord() {
		// given
		WordBreak wordBreak = new WordBreak();
		String words = "aaab";
		Set<String> dicts = new HashSet<>();
		dicts.add("a");
		dicts.add("b");
		boolean expecteds = true;

		// when
		boolean result = wordBreak.isAbleToBreakWords(words, dicts);

		// then
		Assert.assertEquals(expecteds, result);
	}
}
