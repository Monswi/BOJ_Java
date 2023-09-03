import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] left = new int[3];
		int[] right = new int[3];
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			left[i] = a;
			int b = sc.nextInt();
			right[i] = b;
		}
		Arrays.sort(left);
		Arrays.sort(right);
		if (left[1] == left[0]) {
			if (right[1] == right[0]) {
				System.out.println(left[2]);
				System.out.println(right[2]);
			} else {
				System.out.println(left[2]);
				System.out.println(right[0]);
			}
		} else {
			if (right[1] == right[0]) {
				System.out.println(left[0]);
				System.out.println(right[2]);
			} else {
				System.out.println(left[0]);
				System.out.println(right[0]);
			}
		}

	}
}
