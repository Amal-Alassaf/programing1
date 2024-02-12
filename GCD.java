
package gcd;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Take the firs data form the user
        System.out.println("Enter two positive integers, the program stops when one of the intgers is zero: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        // use a while loop to end the program if the user enters a zero as one of the two intgers 
        while (n1 != 0 && n2 !=0){
        // Apply the method gcd on the first data
            System.out.println("The greatest common divisor is: " + gcd(n1,n2));
            // promote the user to enter the next data
            System.out.println("Enter two positive integers, the program stops when one of the intgers is zero: ");
            n1 = input.nextInt();
            n2 = input.nextInt();
        }
    }
    public static int gcd (int n1, int n2){
        // find the minimum of the two numbers
        int d = Math.min(n1, n2);
        // use while to find the GCD
        while(d>= 1){
            if (n1 % d ==0 && n2 % d == 0)
        return d;
            d--;
        }
        // return 1 if there is no greater common diviser 
        return 1;
    }
    
}
