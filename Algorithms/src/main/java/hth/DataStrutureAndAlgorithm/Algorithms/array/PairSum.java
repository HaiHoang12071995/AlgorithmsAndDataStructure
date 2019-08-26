package hth.DataStrutureAndAlgorithm.Algorithms.array;

import java.util.Arrays;

public class PairSum {
	
	boolean pairSum(int[] arr, int n, int sum) {
		
		Arrays.sort(arr);
		int l = 0;
		int r = n - 1;
		
		while(l < r) {
			if(arr[r] + arr[l] == sum)
				return true;
			else if(arr[l] + arr[r] < sum)
				l++;
			else 
				r--;		
		}
		
		return false;
	}
	
}
