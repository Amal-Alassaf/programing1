
package average.average2;
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the grade of 5 students and the input ends when the value is 0");
        int grade = 1;
        int sum = 0;
        int count = 0;
        
        while (grade != 0 && count < 5){
            grade = input.nextInt();
            sum += grade;
            count++;
        }
        System.out.println("The average of the grades is " + (sum / 5));
    }
    
}
