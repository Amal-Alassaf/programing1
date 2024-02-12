
package exerciselab10;
import java.util.Scanner;
public class Example2Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a 7 valuse of a string type: ");
        String [] myThirdArray = new String [7];
        for (int i =0 ; i<7 ; i++){
            myThirdArray[i] = input.next();
        }
        for (int i = 0; i < 7 ; i++){
            System.out.print(myThirdArray[i]);
        }
    }
    
}
