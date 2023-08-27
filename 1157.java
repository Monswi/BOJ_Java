import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] big = new char[26];
		char[] sm = new char[26];
		int[] ans = new int[26];

		int j = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			sm[j] = i;
			j++;
		}
		j = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			big[j] = i;
			j++;
		}
		for (int i = 0; i < word.length(); i++) {
			for (int k = 0; k < 26; k++) {
				if (word.charAt(i) == sm[k] || word.charAt(i) == big[k]) {
					ans[k]++;
				}
			}
		}
		int[] copy = ans.clone();
		Arrays.sort(copy);
		if (copy[25] == copy[24]) {
			System.out.println("?");
		} else {
			int max = ans[0];
			j = 0;
			for (int i = 1; i < 26; i++) {
				if (ans[i] > max) {
					max = ans[i];
					j = i;
				}
			}
			System.out.println(big[j]);
		}
	}
}
