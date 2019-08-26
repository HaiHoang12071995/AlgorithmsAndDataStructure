package hth.DataStrutureAndAlgorithm.Algorithms.array;

public class RotationUseSwap {

	void swap(int arr[], int index1, int index2, int indexRotate) {
		for (int i = 0; i < indexRotate; i++) {
			int temp = arr[index1 + i];
			arr[index1 + i] = arr[index2 + i];
			arr[index2 + i] = temp;
		}
	}

	void leftRotate(int arr[], int d, int n) {
		int i, j;
		if (d == 0 || d == n)
			return;
		i = d;
		j = n - d;
		while (i != j) {
			
			if (i < j) /* A is shorter */
			{
				swap(arr, d - i, d + j - i, i);
				j -= i;
			} else /* B is shorter */
			{
				swap(arr, d - i, d, j);
				i -= j;
			}
		}
		/* Finally, block swap A and B */
		swap(arr, d - i, d, i);
	}

}