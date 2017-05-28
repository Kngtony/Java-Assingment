package JavaApplication1; 
import java.util.Scanner;


public class JavaApplication1 {
    
      public static void main(String[] args) {
          System.out.println("Enter a number");
          Scanner x = new Scanner(System.in);
                  int no = x.nextInt(); 
            if((no%2) == 0){System.out.println("this num is even");
            }
            else{System.out.println("this number is odd");}
      }
      
    
}

