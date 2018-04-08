package lintcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 471. Top K Frequent Words
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 19%
 * 
 * Given a list of words and an integer k, return the top k frequent words in
 * the list.
 * 
 * Notice You should order the words by the frequency of them in the return
 * list, the most frequent one comes first. If two words has the same frequency,
 * the one with lower alphabetical order come first.
 * 
 * 
 * 
 * Example:
 * 
 * Given [ "yes", "lint", "code", "yes", "code", "baby", "you", "baby",
 * "chrome", "safari", "lint", "code", "body", "lint", "code" ]
 * 
 * for k = 3, return ["code", "lint", "baby"].
 * 
 * for k = 4, return ["code", "lint", "baby", "yes"].
 * 
 * 
 * 
 * Challenge:
 * 
 * Do it in O(nlogk) time and O(n) extra space.
 * 
 * Extra points if you can do it in O(n) time with O(k) extra space
 * approximation algorithms.
 * 
 * 
 * 
 * Tags: Hash Table Priority Queue Heap Amazon Bloomberg Uber Yelp Pocket Gems
 * 
 * @author fakezmq
 *
 */
public class TopKFrequentWords {

	/**
	 * a Word class for comparator
	 *
	 */
	private class Word {
		private String word;
		private int count;

		public Word(String word, int count) {
			this.word = word;
			this.count = count;
		}
	}

	/**
	 * 
	 * Changing String array into order the words by the frequency and lower
	 * alphabetical order (Max Heap)
	 *
	 */
	public class topKFrequentWordsComparator implements Comparator<Word> {
		@Override
		public int compare(Word o1, Word o2) {
			if (o1.count != o2.count) {
				return o1.count > o2.count ? -1 : 1;
			} else {
				return o1.word.compareTo(o2.word);
			}
		}
	}

	/**
	 * @param words:
	 *            an array of string
	 * @param k:
	 *            An integer
	 * @return: an array of string
	 */
	public String[] getTopKFrequentWords(String[] words, int k) {
		String[] topKWords = new String[k];
		Comparator<Word> comparator = new topKFrequentWordsComparator();
		PriorityQueue<Word> pq = new PriorityQueue<>(words.length, comparator);
		HashMap<String, Integer> wordsMap = new HashMap<>();

		for (String word : words) {
			if (wordsMap.containsKey(word)) {
				wordsMap.put(word, wordsMap.get(word) + 1);
			} else {
				wordsMap.put(word, 0);
			}
		}
		for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			pq.offer(new Word(entry.getKey(), entry.getValue()));
		}
		for (int i = 0; i < k; i++) {
			if(pq.isEmpty()){
				break;
			}else{
				topKWords[i]=pq.poll().word;
			}
		}

		return topKWords;
	}
}
