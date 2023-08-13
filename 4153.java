import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		while (true) {
			for (int i = 0; i < 3; i++) {
				int a = sc.nextInt();
				arr[i] = a;
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			Arrays.sort(arr);
			int a = arr[0] * arr[0] + arr[1] * arr[1];
			int b = arr[2] * arr[2];
			if (a == b) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
