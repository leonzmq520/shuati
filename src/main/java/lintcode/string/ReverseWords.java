package lintcode.string;

/**
 * 53. Reverse Words in a String
 * 
 * Difficulty: Easy
 * 
 * Accepted Rate: 25%
 * 
 * Given an input string, reverse the string word by word.
 * 
 * Clarification What constitutes a word? A sequence of non-space characters
 * constitutes a word. Could the input string contain leading or trailing
 * spaces? Yes. However, your reversed string should not contain leading or
 * trailing spaces. How about multiple spaces between two words? Reduce them to
 * a single space in the reversed string.
 * 
 * 
 * 
 * example:
 * 
 * Given s = "the sky is blue", 
 * 
 * return "blue is sky the".
 * 
 * 
 * 
 * Tags: String Apple Snapchat Yelp Bloomberg Microsoft
 * 
 * @author fakezmq
 *
 */
public class ReverseWords {
	/*
	 * @param s: A string
	 * 
	 * @return: A string
	 */
	public String reverseWords(String s) {
		String result = "";
		String firstWord = "";
		if (s != null) {
			String[] words = s.trim().split(" ");
			if (words.length > 0) {
				int size = words.length;
				for (int i = size - 1; i > 0; i--) {
					result += words[i] + " ";
				}
				firstWord = words[0];
			}
		}
		return result + firstWord;
	}
}
