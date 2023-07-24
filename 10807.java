import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			A[i] = a;
		}
		
		int v = sc.nextInt();
		int c = 0;
		
		for(int i=0;i<n;i++) {
			int b = A[i];
			if(b==v) {
				c = c+1;
			}
		}
		System.out.println(c);
	}
}
