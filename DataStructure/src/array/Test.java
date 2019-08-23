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
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Array before Rotation: ");
		t.printArr(arr);
		System.out.println("\nArray after Rotation: ");
		t.printArr(r.arrayRotate(arr,2));
	}
}
