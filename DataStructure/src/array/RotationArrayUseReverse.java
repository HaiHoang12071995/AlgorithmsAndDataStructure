package array;

public class RotationArrayUseReverse {
  int a =0;
	
	public int[] rightRotate(int[] arr, int indexRotate) {
		int n = arr.length;
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			if(i < indexRotate)
				temp[i] = arr[n-(indexRotate-i)];	
			else
				temp[i] = arr[i-indexRotate];
			
		}
		return temp;
		
		
	}
}
