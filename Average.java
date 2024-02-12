
package average;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        // This program calculates the average grades of 6 students
        Scanner input = new Scanner (System.in);
        int count = 1;
        int sum = 0;
        
        while (count <= 6){
            System.out.println("Enter the grade of student number " + count);
            int grade = input.nextInt();
            sum += grade;
            count++;   
        }
        System.out.println("The average of the students grade is " + ((double)sum / count));
    }
    
}
