import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		double av = sc.nextInt();
		double num2 = av*2-num1;
		System.out.print(Math.round(num2));
	}
}
