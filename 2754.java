import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String x = sc.next();
      String y = x.substring(0, 1);
      double score = 0.0;
      
      switch(y) {
      	case "A": score = 4.0;break;
      	case "B": score = 3.0;break;
      	case "C": score = 2.0;break;
      	case "D": score = 1.0;break;
      	case "F": score = 0.0;break;
      }
      
      if(x.length()>1) {
    	  String z = x.substring(1, 2);
    	  if(z.equals("+")) {
    		  System.out.println(score+0.3);
    	  } else if(z.equals("-")) {
    		  System.out.println(score-0.3);
    	  } else {
    		  System.out.println(score);
    	  }
      } else {
      System.out.println(score);
      }
   }
}
