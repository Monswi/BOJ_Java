import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}

		int max = arr[0];

		for (int i = 1; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				System.out.println(i + 1);
			}
		}

	}
}
