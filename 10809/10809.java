import java.util.Scanner;
//수정후
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (arr[c - 'a'] == -1) {
				arr[c - 'a'] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}

/////수정전
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] alp = new char[26];
		char[] arr = new char[word.length()];
		int[] ans = new int[26];

		for (int i = 0; i < 26; i++) {
			ans[i] = -1;
		}

		int j = 0;

		for (char i = 'a'; i <= 'z'; i++) {
			alp[j] = i;
			j++;
		}

		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
			for (int k = 0; k < 26; k++) {
				if (arr[i] == alp[k] && ans[k] == -1) {
					ans[k] = i;
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.printf("%d ", ans[i]);
		}
	}
}
