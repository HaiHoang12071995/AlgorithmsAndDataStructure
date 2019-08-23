package array;

public class RotationArrayUseResever {
	public void resever(int[] arr, int start, int end) {
		while(start < end) {
			int temp  = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public void resever(int[] arr, int start, int end) {
		while(start < end) {
			int temp  = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	
}
