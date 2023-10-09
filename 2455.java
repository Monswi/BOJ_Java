import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int out1 = sc.nextInt();
		int in1 = sc.nextInt();
		int out2 = sc.nextInt();
		int in2 = sc.nextInt();
		int out3 = sc.nextInt();
		int in3 = sc.nextInt();
		int out4 = sc.nextInt();
		int in4 = sc.nextInt();

		int[] arr = { in1, in1 - out2 + in2, in1 - out2 + in2 - out3 + in3 };

		int max = arr[0];
		if (arr[1] > max) {
			if (arr[1] > arr[2]) {
				max = arr[1];
			} else {
				max = arr[2];
			}
		}
		if (arr[2] > max) {
			max = arr[2];
		}
		System.out.println(max);
	}
}
