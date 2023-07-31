import java.util.Scanner;
//2744
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int b = a.length();

      for (int i = 0; i < b; i++) {
         char c = a.charAt(i);
         // String d = arr[i];
         if (Character.isUpperCase(c)) {
            System.out.print(Character.toLowerCase(c));
         } else {
            System.out.print(Character.toUpperCase(c));
         }
      }
   }
}
