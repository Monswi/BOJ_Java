import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String d = String.valueOf(a * b * c);
		int[] arr = new int[10];
		for (int i = 0; i < d.length(); i++) {
			arr[d.charAt(i) - '0']++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
