import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] burger = new int [3];
		int [] drink = new int [2];
		
		for(int i=0;i<3;i++) {
			int price = sc.nextInt();
			burger[i] = price;
		}
		Arrays.sort(burger);
		
		for(int i=0;i<2;i++) {
			int price = sc.nextInt();
			drink[i] = price;
		}
		Arrays.sort(drink);
		
		System.out.println(burger[0]+drink[0]-50);
	}
}
