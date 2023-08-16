import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < Math.sqrt(1000)) {
				for (int j = 1; j < Math.sqrt(1000); j++) {
					if (a % j == 0) {
						arr[i] += 1;
					}
				}
			} else {
				for (int j = 1; j <= a; j++) {
					if (a % j == 0) {
						arr[i] += 1;
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 2) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
