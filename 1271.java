import java.math.BigInteger;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		BigInteger m = new BigInteger(sc.next());
		
		BigInteger quo = n.divide(m);
		BigInteger rem = n.remainder(m);
		System.out.println(quo);
		System.out.println(rem);
	}
}
