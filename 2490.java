import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int j=0;j<3;j++) {
			int [] arr = new int [4];
			int sum =0;
			for(int i=0;i<4;i++) {
				int a = sc.nextInt();
				arr[i] = a;
				sum += a;
			}
			if(sum==3) {
				System.out.println("A");
			}else if(sum==2) {
				System.out.println("B");
			}else if(sum==1) {
				System.out.println("C");
			}else if(sum==0) {
				System.out.println("D");
			}else {
				System.out.println("E");
			}
		}
	}
}
