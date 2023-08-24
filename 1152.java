import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String a = sc.nextLine();
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				count +=1;
			}
		}
		if(a.charAt(0)==' '&&a.charAt(a.length()-1)==' ') {
			System.out.println(count-1);
		}else if(a.charAt(0)!=' '&&a.charAt(a.length()-1)!=' ') {
			System.out.println(count+1);
		}else {
			System.out.println(count);
		}
	}
}

