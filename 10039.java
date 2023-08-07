import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		
		for(int i=0;i<5;i++) {
			int grade = sc.nextInt();
			if(grade>=40) {
				arr[i] = grade;
			} else {
				arr[i] = 40;
			}
		}
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += arr[i];
		}
		System.out.println(sum/5);
	}
}
