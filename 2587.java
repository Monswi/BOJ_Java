import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] arr = new int [5];
        for(int i=0;i<5;i++) {
            int a = sc.nextInt();
            arr[i] = a;
            sum += a;
        }
        Arrays.sort(arr);
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}