
package substraction;
import java.util.Scanner;
public class Substraction {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the numbers, the program ends when 0 in etered");
        int sum = 0;
        int answer = input.nextInt();
        // using do while 
        do {
            sum += answer;
            answer = input.nextInt();
        } while (answer != 0);
        
        
        // using while loop
        while (answer != 0){
            sum += answer;
            answer = input.nextInt();
        }


        // using for loop
        for (;answer != 0;){
            sum += answer;
            answer = input.nextInt();
        }
        System.out.println("The sum is: " + sum);
    
    }
    
}
