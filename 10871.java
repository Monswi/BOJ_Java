import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int [] A;
		A = new int [n];
		
		for(int i=0;i<n;i++) {
		int a = sc.nextInt();
		A[i]=a;
		}
		
		for(int i=0;i<n;i++) {
			int b = A[i];
				if(b<x) {
				System.out.println(b);
				}
		}
	}
}
