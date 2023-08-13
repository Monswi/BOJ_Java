import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double a = Math.PI * Math.pow(r, 2);
		double b = 2 * Math.pow(r, 2);
		System.out.printf("%.4f", a);
		System.out.println();
		System.out.println(b);
	}
}
