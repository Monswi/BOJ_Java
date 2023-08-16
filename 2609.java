import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 0;

		for (int i = a; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		int lcm = a * (b / gcd);
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
