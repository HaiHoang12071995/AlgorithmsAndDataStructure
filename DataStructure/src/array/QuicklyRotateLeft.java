package array;

public class QuicklyRotateLeft {
	int[] rotateLeft(int[] arr, int lengthArr, int indexRotate){
		for(int i = indexRotate; i < indexRotate + lengthArr; i++) {
				arr[i] = arr[i % lengthArr];
		}
		return arr;
	}
}
