package array;

public class ArrayRotation {

	public int[] leftRotate(int[] arr, int indexRotate) {
		
		int n = arr.length;
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			if(indexRotate < n) 
				temp[i] = arr[indexRotate];
			else
				temp[i] = arr[indexRotate - n];
			
			indexRotate++;
		}
		return temp;
	}
	
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
