package array;

/*binary search with example array = [3,4,5,1,2]*/
public class BinarySearch {
	public int binaryWithArrayRotation(int[] arr, int n, int x, int l, int r) {
		pivotedBinarySearch(arr, n, x);
		findPivot(arr, l, r);
		binarySearch(arr, l, r, x);
		return pivotedBinarySearch(arr, n, x);
	}

	int pivotedBinarySearch(int[] arr, int n, int x) {
		int pivot = findPivot(arr, 0, n - 1);

		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, x);

		if (arr[pivot] == x)
			return pivot;

		if (arr[0] <= x)
			return binarySearch(arr, 0, n - 1, x);

		return binarySearch(arr, pivot + 1, n - 1, x);
	}

	int findPivot(int[] arr, int l, int r) {

		if (l < r)
			return -1;

		if (l == r)
			return l;

		int mid = (l + r) / 2;

		if (mid < r && arr[mid] > arr[mid + 1])
			return mid;

		if (mid > l && arr[mid] < arr[mid - 1])
			return mid - 1;

		if (arr[l] >= arr[mid])
			return findPivot(arr, l, mid - 1);

		return findPivot(arr, mid + 1, r);
	}

	int binarySearch(int arr[], int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

}
