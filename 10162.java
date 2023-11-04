import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();

        if(sec%10!=0){
            System.out.println("-1");
        } else {
            int a = sec / 300;
            int b = (sec - (300 * a)) / 60;
            int c = (sec - (300 * a) - (60 * b)) / 10;
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
