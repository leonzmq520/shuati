package lintcode.sort;

/**
 * 464. Sort Integers II
 * 
 * Difficulty: Easy
 * 
 * Accepted Rate: 28%
 * 
 * Given an integer array, sort it in ascending order. Use quick sort, merge
 * sort, heap sort or any O(nlogn) algorithm.
 * 
 * 
 * 
 * Example:
 * 
 * Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
 * 
 * 
 * 
 * Tags: Quick Sort Sort Merge Sort
 * 
 * @author fakezmq
 *
 */
public class SortIntegersII {
	/**
	 * @param A:
	 *            an integer array
	 * @return: nothing
	 */
	public void mergeSort(int[] A) {
		int left = 0, right = A.length - 1;
		mSort(A, left, right);
	}

	private void mSort(int[] A, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort first and second halves
			mSort(A, left, mid);
			mSort(A, mid + 1, right);

			// Merge the sorted halves
			merge(A, left, mid, right);
		}
	}

	private void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * @param A:
	 *            an integer array
	 * @return: nothing
	 */
	public void quickSort(int[] A) {
		int left = 0, right = A.length - 1;
		qSort(A, left, right);
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be
	 * sorted,
	 * 
	 * low --> Starting index, high --> Ending index
	 */
	private void qSort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			qSort(arr, low, pi - 1);
			qSort(arr, pi + 1, high);
		}
	}

	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	private int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
