import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		double ans = Math.ceil((double) (v - b) / (a - b));
		int fin = (int) ans;
		if (a == v) {
			System.out.println(1);
		} else {
			System.out.println(fin);
		}
	}
}
