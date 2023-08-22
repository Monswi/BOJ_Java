import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			String a = sc.next();
			int x = a.charAt(0) - '0';
			int y = a.charAt(2) - '0';
			System.out.println(x + y);
		}
	}
}
