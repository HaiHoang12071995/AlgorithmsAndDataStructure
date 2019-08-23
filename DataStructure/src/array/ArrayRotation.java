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
	public void printArr(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) 
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		ArrayRotation r = new ArrayRotation();
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Array before Rotation: ");
		r.printArr(arr);
		System.out.println("\nArray after Rotation: ");
		r.printArr(r.rightRotate(arr, 2));
	}
}
