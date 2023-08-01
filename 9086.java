import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0;i<test;i++) {
			String a = sc.next();
			int l = a.length();
			char b = a.charAt(0);
			char c = a.charAt(l-1);
			System.out.print(b);
			System.out.println(c);
		}
	}
}
