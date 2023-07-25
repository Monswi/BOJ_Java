import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] A = new int[n][m];
		int [][] B = new int[n][m];
		
		for(int e=0;e<n;e++) {
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				A[e][i] = a;
			}
		}
		
		for(int e=0;e<n;e++) {
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				B[e][i] = a;
			}
		}
		
		int [][] C = new int[n][m];
		
		for(int e=0;e<n;e++) {
			for(int i=0;i<m;i++) {
				C[e][i] = A[e][i] + B[e][i];
			}
		}
		
		for(int e=0;e<n;e++) {
			for(int i=0;i<m;i++) {
				System.out.println(C[e][i]);
			}
		}
	}
	
}
