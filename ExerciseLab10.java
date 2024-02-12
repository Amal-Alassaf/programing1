
package exerciselab10;
import java.util.Scanner;
public class ExerciseLab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (the input ends when you enter zero): ");
        int number = input.nextInt();
        int p = 0;
        int n = 0;
        double total = 0;
        while (number != 0){
            total += number;
            if (number > 0)
                p++;
            else 
                n++;
            number = input.nextInt();
        }
        
        double average = total /(p+n);
        System.out.println("The numbers of positives is: " + p);
        System.out.println("The numbers of negatives is: " + n);
        System.out.println("The total is: " + total);
        System.out.println("The avarege is: " + average);
     }
}




