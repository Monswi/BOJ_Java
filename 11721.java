import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		for (int i = 0; i < word.length() / 10; i++) {
			System.out.println(word.substring(10 * i, 10 * (i + 1)));
		}
		if (word.length() % 10 != 0) {
			System.out.println(word.substring(10 * (word.length() / 10), word.length()));
		}
	}
}
