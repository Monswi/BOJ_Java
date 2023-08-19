import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[k][n];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += j + 1;
				arr[0][j] = sum;
			}
			for (int x = 1; x < k; x++) {
				for (int y = 0; y < n; y++) {
					for (int z = 0; z <= y; z++) {
						arr[x][y] += arr[x - 1][z];
					}
				}
			}
			System.out.println(arr[k - 1][n - 1]);
		}
	}
}
