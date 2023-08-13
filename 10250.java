import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < t; i++) {
			int height = sc.nextInt();
			int width = sc.nextInt();
			int num = sc.nextInt();
			if (num % height != 0) {
				ans = (num % height) * 100 + 1 + (num / height);
			} else {
				ans = height * 100 + (num / height);
			}
			System.out.println(ans);
		}
	}
}
