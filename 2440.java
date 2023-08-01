import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char s = '*';
		
		for(int i=a;i>=1;i--) {
			for(int e=1;e<=i;e++) {
				System.out.print(s);
			} System.out.println();
		}
	}
}
