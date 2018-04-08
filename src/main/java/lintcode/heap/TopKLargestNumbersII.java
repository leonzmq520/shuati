package lintcode.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 545. Top k Largest Numbers II
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 29%
 * 
 * Implement a data structure, provide two interfaces:
 * 
 * 1.add(number). Add a new number in the data structure.
 * 
 * 2.topk(). Return the top k largest numbers in this data structure. k is given
 * when we create the data structure.
 * 
 * 
 * 
 * Example:
 * 
 * s = new Solution(3);
 * 
 * >> create a new data structure.
 * 
 * s.add(3)
 * 
 * s.add(10)
 * 
 * s.topk()
 * 
 * >> return [10, 3]
 * 
 * s.add(1000)
 * 
 * s.add(-99)
 * 
 * s.topk()
 * 
 * >> return [1000, 10, 3]
 * 
 * s.add(4)
 * 
 * s.topk()
 * 
 * >> return [1000, 10, 4]
 * 
 * s.add(100)
 * 
 * s.topk()
 * 
 * >> return [1000, 100, 10]
 * 
 * 
 * 
 * Tags: Heap Priority Queue
 * 
 * @author fakezmq
 *
 */
public class TopKLargestNumbersII {
	private int maxSize;
	private PriorityQueue<Integer> maxheap;

	/*
	 * @param k: An integer
	 */
	public TopKLargestNumbersII(int k) {
		maxheap = new PriorityQueue<>(k);
		maxSize = k;
	}

	/*
	 * @param num: Number to be added
	 * 
	 * @return: nothing
	 */
	public void add(int num) {
		if (maxheap.size() < maxSize) {
			maxheap.add(num);
			return;
		}
		if (num > maxheap.peek()) {
			maxheap.poll();
			maxheap.add(num);
		}

	}

	/*
	 * @return: Top k element
	 */
	public List<Integer> topk() {
		Iterator<Integer> it = maxheap.iterator();
		List<Integer> results = new ArrayList<>();

		while (it.hasNext()) {
			results.add(it.next());
		}
		Collections.sort(results, Collections.reverseOrder());

		return results;
	}
}
