package lintcode.string;

import java.util.Set;

/**
 * 107. Word Break
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 14%
 * 
 * Given a string s and a dictionary of words dict, determine if s can be break
 * into a space-separated sequence of one or more dictionary words.
 * 
 * 
 * 
 * Example:
 * 
 * Given s = "lintcode", dict = ["lint", "code"].
 * 
 * Return true because "lintcode" can be break as "lint code".
 * 
 * Tags: String Dynamic Programming Facebook Amazon Bloomberg Uber Yahoo Google
 * Pocket Gems Coupang Square
 * 
 * @author fakezmq
 *
 */
public class WordBreak {
	/*
	 * @param s: A string
	 * 
	 * @param dict: A dictionary of words dict
	 * 
	 * @return: A boolean
	 */
	public boolean isAbleToBreakWords(String s, Set<String> dict) {
		if (s == null){
            return false;
        }
        if (s.length() == 0 && dict.size() == 0){
            return true;
        }
        int n = s.length();
        int maxLength = getMaxLength(dict);
        boolean[] path = new boolean[n + 1];
        path[0] = true;
        for (int i = 1; i < n + 1; i++){
            for (int j = i - 1; j >= 0; j--){
                if (i - j > maxLength){
                    break;
                }
                if (path[j]){
                   String sub = s.substring(j, i);
                   if (dict.contains(sub)){
                       path[i]= true;
                       break;
                   }
                }
            }
        }
        return path[n];
    }
	
    private int getMaxLength(Set<String> dict){
        int maxLength = 0;
        for(String str : dict){
            maxLength = Math.max(maxLength, str.length());
        }
        return maxLength;
	}
}
