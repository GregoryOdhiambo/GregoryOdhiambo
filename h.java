package factorial;
import java.util.Scanner;

/**
 *
 * @author GREGORY
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in);
        number= sc.nextInt();
        int answer= factorial(number);
        System.out.println("factorial of" + number + "is" + answer);
        // TODO code application logic here
    }
    int factorial(int n){
        if(n==1)
            return 1;
        return n* factorial(n-1);
    }
    
}
