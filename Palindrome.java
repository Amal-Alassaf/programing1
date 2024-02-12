
package palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        // promot the user to enter a three digit integer 
        System.out.println("Enter a three-digit integer: ");
        Scanner input = new Scanner (System.in);
        int value = input.nextInt();
        // Find the first and last digits of the number
        int digit1 = (value / 100 );
        int digit3 = (value % 10);
        // check if the first digit is equal to the last one 
        if (digit1 == digit3){
            System.out.println(value + " is a palindrome");
        }
        else {
        System.out.println(value + " is not a palindrome");
        }
    }
}
