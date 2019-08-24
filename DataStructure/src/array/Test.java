package array;

public class Test {
	public static final RotationArrayUseReversal r = new RotationArrayUseReversal();
	public void printArr(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) 
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		RotationUseSwap r = new RotationUseSwap();
		BinarySearch b = new BinarySearch();
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		System.out.println("Array before Rotation: ");
		t.printArr(arr);
		System.out.println("\nArray after Rotation: ");
		r.leftRotate(arr, 2, n);
		t.printArr(arr);
		System.out.println("vi tri cua x = 5 la: ");
		System.out.println(b.binaryWithArrayRotation(arr, n, 5, 0, n - 1));	
	}
}
