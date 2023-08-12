import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		int f = h + ((m + t) / 60);
		if (f > 23) {
			System.out.println(f - 24);
		} else {
			System.out.println(f);
		}
		System.out.println((m + t) % 60);

	}
}
