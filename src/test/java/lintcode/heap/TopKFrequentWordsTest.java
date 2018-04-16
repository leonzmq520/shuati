package lintcode.heap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TopKFrequentWordsTest {
	@Test
	public void shouldGetTopKFrequentWords() {
		// given
		TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
		String[] words = { "yes", "lint", "code", "yes", "code", "baby", "you", "baby", "chrome", "safari", "lint",
				"code", "body", "lint", "code" };
		String[] expecteds1 = { "code", "lint", "baby" };
		String[] expecteds2 = { "code", "lint", "baby", "yes" };
		int k1 = 3;
		int k2 = 4;

		// when case 1
		String[] results1 = topKFrequentWords.getTopKFrequentWords(words, k1);
		// then case 1
		Assert.assertEquals(expecteds1, results1);

		// when case 2
		String[] results2 = topKFrequentWords.getTopKFrequentWords(words, k2);
		// then case 1
		Assert.assertEquals(expecteds2, results2);
	}
}
