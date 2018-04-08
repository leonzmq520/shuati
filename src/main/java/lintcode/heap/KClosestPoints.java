package lintcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 612. K Closest Points
 * 
 * Difficulty: Medium
 * 
 * Accepted Rate: 21%
 * 
 * Given some points and a point origin in two dimensional space, find k points
 * out of the some points which are nearest to origin. Return these points
 * sorted by distance, if they are same with distance, sorted by x-axis,
 * otherwise sorted by y-axis.
 * 
 * 
 * 
 * Example:
 * 
 * Given points = [[4,6],[4,7],[4,4],[2,5],[1,1]], origin = [0, 0], k = 3
 * 
 * return [[1,1],[2,5],[4,4]]
 * 
 * 
 * 
 * Tags: Amazon Heap LinkedIn
 * 
 * @author fakezmq
 *
 */
public class KClosestPoints {
	// Definition for a point.
	public class Point {
		int x, y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

	// Definition for a point with distance.
	private class PPoint {
		int x, y, dist;

		PPoint(Point p, int dist) {
			this.x = p.x;
			this.y = p.y;
			this.dist = dist;
		}
	}

	// get the distance between 2 points.
	private int distance(Point src, Point dest) {
		int xx = src.x - dest.x;
		int yy = src.y - dest.y;
		return xx * xx + yy * yy;
	}

	/**
	 * @param points:
	 *            a list of points
	 * @param origin:
	 *            a point
	 * @param k:
	 *            An integer
	 * @return: the k closest points
	 */
	public Point[] getTopkClosest(Point[] points, Point origin, int k) {
		Point[] topKPoints = new Point[k];
		PriorityQueue<PPoint> pq = new PriorityQueue<>(k, new Comparator<PPoint>() {
			@Override
			public int compare(PPoint o1, PPoint o2) {
				if (o1.dist != o2.dist) {
					return o1.dist - o2.dist;
				} else {
					if (o1.x != o2.x) {
						return o1.x - o2.x;
					} else {
						return o1.y - o2.y;
					}
				}
			}
		});
		if (points == null || points.length < k) {
			return null;
		}
		for (Point point : points) {
			pq.offer(new PPoint(point, distance(origin, point)));
		}
		for (int i = 0; i < k; i++) {
			PPoint temp = pq.poll();
			topKPoints[i] = new Point(temp.x, temp.y);
		}
		return topKPoints;
	}
}
