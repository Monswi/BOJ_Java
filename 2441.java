import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char s = '*';
		char b = ' ';
		
		for(int i=0;i<a;i++) {
			for(int e=0;e<i;e++) {
				System.out.print(b);
			} for(int e=0;e<a-i;e++) {
				System.out.print(s);
			} System.out.println();
		}
	}
}
