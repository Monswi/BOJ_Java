import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = { x, y, h - y, w - x };
		int min = x;
		for (int i = 1; i < 4; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(min);
	}
}
