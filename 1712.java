import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b>=c) {
            System.out.println("-1");
        }else {
            int ans = (int) (a/(c-b))+1;
            System.out.println(ans);
        }
    }
}