package JavaApplication2;
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stat;
       
       boolean isPrime=true;
        System.out.println("Enter a number");
        Scanner w = new Scanner(System.in);
        int num = w.nextInt();
    for(int i=2;i<=num/2;i++){
        stat=num%i;
    if(stat==0)
    {
        isPrime=false;
        break;
    }}
    if(isPrime){System.out.println(num + "is prime number");}
    else{System.out.println(num + "is not prime number");
    }
    }    
}

