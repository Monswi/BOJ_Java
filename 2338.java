import java.math.BigInteger;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		BigInteger plus = a.add(b);
		BigInteger minus = a.subtract(b);
		BigInteger multiply = a.multiply(b);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
	}
}
