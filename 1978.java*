import java.util.Scanner;
//수정후
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if (isPrime(num) == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isPrime(int number) {
		if (number == 1)
			return false;

		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;

		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}



/////수정전
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < Math.sqrt(1000)) {
				for (int j = 1; j <= a; j++) {
					if (a % j == 0) {
						arr[i] += 1;// answer2
					}
				}
			} else {
				for (int j = 1; j <= Math.sqrt(1000); j++) {
					if (a % j == 0) {
						arr[i] += 20;
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 2 || arr[i] == 20) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
