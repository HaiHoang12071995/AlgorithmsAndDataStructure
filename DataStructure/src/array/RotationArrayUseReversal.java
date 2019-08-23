package array;

public class RotationArrayUseReversal {
	public void reversal(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public int[] arrayRotate(int arr[], int indexRotate) {
		int n = arr.length;
		reversal(arr, 0, indexRotate - 1);
		reversal(arr, indexRotate, n - 1);
		reversal(arr, 0, n - 1);
		return arr;
	}
	
	
}
