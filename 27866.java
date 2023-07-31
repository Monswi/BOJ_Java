import java.util.Scanner;
//27866
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int i = sc.nextInt();

      System.out.print(S.charAt(i - 1));
   }
}
