import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0;i<test;i++) {
			String ox = sc.next();
			int point = 0;
			int grade = 0;
			
			for(int j=0;j<ox.length();j++) {
				if(ox.charAt(j)=='O') {
					point++;
					grade += point;
				} else {
					point = 0;
				}
			}
			System.out.println(grade);
		}
	}
}
