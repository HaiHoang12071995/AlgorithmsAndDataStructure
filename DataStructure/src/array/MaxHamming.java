package array;

public class MaxHamming {
	final int[] arr = {2,3,1,4};
	int n = arr.length;
	
	int maxHamming(int[] arr, int n) {
		int[] brr =  doubleArr(arr);
		return findMaxHamming(arr,brr);
	}
	
	int[] doubleArr(int arr[]) {
		int[] brr = new int[2*n + 1];
		for(int i = 0; i < n; i++)
			brr[i] = arr[i];
		for(int i = 0; i < n; i++)
			brr[n + i] = arr[i];
		return brr;
	}
	
	int findMaxHamming(int arr[], int brr[]) {
		int maxHam = 0;
		
		for(int i = 1; i< n; i++) {
			int currHam = 0;
			for(int j = i, k = 0; j< n + i; j++,n++) {
				if(brr[j] != arr[k])
					currHam++;
				if(currHam == n)
					return n;
				maxHam = Math.max(maxHam, currHam);
			}
		}
		return maxHam;
	}
}
