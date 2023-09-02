import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		if (word.length() % 10 != 0) {
			for (int i = 0; i < word.length() / 10; i++) {
				System.out.println(word.substring(10 * i, 10 * (i + 1)));
			}
			System.out.println(word.substring(10 * (word.length() / 10), word.length()));
		} else {
			for (int i = 0; i < (word.length() / 10) - 1; i++) {
				System.out.println(word.substring(10 * i, 10 * (i + 1)));
			}
			System.out.println(word.substring(10 * ((word.length() / 10) - 1), word.length()));
		}
	}
}
