import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		long a = n-m;
				
		if (a>= 0) {
			System.out.println(a);
		}else {
			System.out.println(-a);
		}
	}
}
