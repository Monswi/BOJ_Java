import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int re_a = (a%10)*100+((a/10)%10)*10+(a/100);
		int re_b = (b%10)*100+((b/10)%10)*10+(b/100);
		
		if(a%10>b%10) {
			System.out.println(re_a);
		} else if(b%10>a%10) {
			System.out.println(re_b);
		} else {
			if((a/10)%10>(b/10)%10) {
				System.out.println(re_a);
			}else if((b/10)%10>(a/10)%10) {
				System.out.println(re_b);
			} else {
				if((a/100)>(b/100)) {
					System.out.println(re_a);
				}else{
					System.out.println(re_b);
				} 
			}
		}
	}
}
