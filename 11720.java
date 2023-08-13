import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();//입력 버퍼 없애기
		String s = sc.nextLine();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int a = s.charAt(i) - '0';//아스키코드
			sum += a;
		}
		System.out.println(sum);

	}
}
