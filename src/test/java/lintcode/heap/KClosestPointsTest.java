package lintcode.heap;

import org.testng.Assert;
import org.testng.annotations.Test;

import lintcode.heap.KClosestPoints.Point;

public class KClosestPointsTest {
	@Test
	public void shouldGetTopKFrequentWords() {
		// given
		KClosestPoints kClosestPoints = new KClosestPoints();
		Point point1 = kClosestPoints.new Point(4, 6);
		Point point2 = kClosestPoints.new Point(4, 7);
		Point point3 = kClosestPoints.new Point(4, 4);
		Point point4 = kClosestPoints.new Point(2, 5);
		Point point5 = kClosestPoints.new Point(1, 1);
		Point expectedPoint1 = kClosestPoints.new Point(1, 1);
		Point expectedPoint2 = kClosestPoints.new Point(2, 5);
		Point expectedPoint3 = kClosestPoints.new Point(4, 4);
		Point origin = kClosestPoints.new Point(0, 0);
		Point[] points = new Point[5];
		Point[] expecteds = new Point[3];
		points[0] = point1;
		points[1] = point2;
		points[2] = point3;
		points[3] = point4;
		points[4] = point5;
		expecteds[0] = expectedPoint1;
		expecteds[1] = expectedPoint2;
		expecteds[2] = expectedPoint3;
		int k = 3;

		// when
		Point[] results = kClosestPoints.getTopkClosest(points, origin, k);

		// then
		Assert.assertEquals(expecteds.length, results.length);
		for (int i = 0; i < expecteds.length; i++) {
			Assert.assertEquals(expecteds[i].x, results[i].x);
			Assert.assertEquals(expecteds[i].y, results[i].y);
		}
	}
}
