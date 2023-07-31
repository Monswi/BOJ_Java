import java.util.Scanner;
//2754/틀려서 다시 해야 함
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String x = sc.next();
      String y = x.substring(0, 1);
      String z = x.substring(1, 2);

      double a = 4.0;
      double b = 3.0;
      double c = 2.0;
      double d = 1.0;
      double f = 0.0;

      if (y.equals("A")) {
         if (z.equals("0")) {
            System.out.println(a);
         } else if (z.equals("+")) {
            System.out.print(a + 0.3);
         } else {
            System.out.print(a - 0.3);
         }
      } else if (y.equals("B")) {
         if (z.equals("0")) {
            System.out.println(b);
         } else if (z.equals("+")) {
            System.out.print(b + 0.3);
         } else {
            System.out.print(b - 0.3);
         }
      } else if (y.equals("C")) {
         if (z.equals("0")) {
            System.out.println(c);
         } else if (z.equals("+")) {
            System.out.print(c + 0.3);
         } else {
            System.out.print(c - 0.3);
         }
      } else if (y.equals("D")) {
         if (z.equals("0")) {
            System.out.println(d);
         } else if (z.equals("+")) {
            System.out.print(d + 0.3);
         } else {
            System.out.print(d - 0.3);
         }
      } else if (y.equals("F")) {
         System.out.print(f);
      }
   }
}
