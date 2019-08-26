package hth.DataStrutureAndAlgorithm.Algorithms.array;

public class MaxSumArray {

	static int arr[] = new int[] { 3, 1, 2};
	static int n = arr.length;
	int currVal = 0;
	int maxVal;
	int arrSum;

	public void maxSum(int[] arr, int n) {
		arrSumAndCurrVal(arr, n);
		int kq = compareRotates(arr, n);
		System.out.println(""+kq);
	}

	public void arrSumAndCurrVal(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			arrSum = arrSum + arr[i];
			currVal += i * arr[i];
		}
	}

	public int compareRotates(int arr[], int n) {
		maxVal = currVal;
		for (int j = 1; j < n; j++) {
			currVal = currVal + arrSum - n * arr[n - j];
			if (currVal > maxVal)
				maxVal = currVal;
		}
		return maxVal;
	}
	
	
	public static void main(String [] args) {
		MaxSumArray m = new MaxSumArray();
		m.maxSum(arr, n);
	}
}
