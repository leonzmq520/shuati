package lintcode.string;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ReverseWordsTest {
	@Test
	public void shouldGetReverseWords() {
		// given
		ReverseWords reverseWords = new ReverseWords();
		String words = "the sky is blue";
		String expecteds = "blue is sky the";

		// when
		String result = reverseWords.reverseWords(words);

		// then
		Assert.assertEquals(expecteds, result);
	}
}
