import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr	= new int[3];
		
		for(int i=0;i<3;i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);
		
		if(arr[0]==arr[1] && arr[1]==arr[2]) {
			System.out.println(10000+1000*arr[0]);
		} else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[2]!=arr[0]){
			System.out.println(arr[2]*100);
		} else {
			if(arr[0]==arr[1]) {
				System.out.println(1000+arr[0]*100);
			}else {
				System.out.println(1000+arr[1]*100);
			}
		}
	}
}
