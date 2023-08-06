import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			arr[i] = a*a;
		}
		
		for(int i=0;i<5;i++) {
			sum += arr[i];
		}
		int ans = sum%10;
		System.out.println(ans);
	}
}
