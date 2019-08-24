package array;

public class PrintQuerySum {
	static class Query {
		private int L, R;

		Query(int L, int R) {
			this.L = L;
			this.R = R;
		}

	}

	public static void printQuerySum(int a[], int n, Query q[], int m) {
		for (int i = 0; i < m; i++) {
			int L = q[i].L, R = q[i].R;

			int sum = 0;
			for (int j = L; j <= R; j++)
				sum += a[j];

			System.out.println("Sum of [" + L + "," + R + "] is\t" + sum);

		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
		int n = a.length;
		Query[] q = { new Query(0, 4), new Query(1, 3), new Query(2, 4) };
		printQuerySum(a, n, q, 3);
	}

}
