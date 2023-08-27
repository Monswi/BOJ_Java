import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			int sum = 0;
			int count = 0;
			int stud = sc.nextInt();
			int arr[] = new int[stud];

			for (int j = 0; j < stud; j++) {
				int grade = sc.nextInt();
				arr[j] = grade;
				sum += grade;
			}

			double av = (double) sum / stud;

			for (int j = 0; j < stud; j++) {
				if (arr[j] > av) {
					count += 100;
				}
			}
			double ans = (double) count / stud;
			System.out.printf("%.3f%%%n", ans);
		}
	}
}
