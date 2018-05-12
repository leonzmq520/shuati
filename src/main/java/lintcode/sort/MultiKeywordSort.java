package lintcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 846. Multi-keyword Sort
 * 
 * Difficulty: Easy
 * 
 * Accepted Rate: 38%
 * 
 * Given n students(number from 1 to n) and their examination grades. There are
 * two keywords, examination grades and student id. Order the array according to
 * the first keyword (Descending), if the first key is the same, it is sorted by
 * the second keyword (ascending).
 * 
 * 
 * 
 * Example:
 * 
 * Given [[2,50],[1,50],[3,100]], return [[3,100],[1,50],[2,50]]
 * 
 * 
 * 
 * Tags: Sort
 * 
 * @author fakezmq
 *
 */
public class MultiKeywordSort {
	/**
	 * @param array:
	 *            the input array
	 * @return: the sorted array
	 */
	public int[][] getGradesByMultiKeyword(int[][] array) {
		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o2[1] == o1[1]) {
					return o1[0] - o2[0];
				}
				return o2[1] - o1[1];
			}

		});
		return array;
	}
}
