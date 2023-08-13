import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		int position_1 = 0, position_2 = 0;
		int max = arr[0][0];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					position_1 = i;
					position_2 = j;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", position_1 + 1, position_2 + 1);

	}
}
