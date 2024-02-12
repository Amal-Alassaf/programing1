
package highestscore;
import java.util.Scanner;
public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of students: ");
        int sNumber = input.nextInt();
        String highestName = "";
        int highestScore = 0;
        String secondHighest = "";
        int secondHighestS = 0;
        
        for (int i = 0;i < sNumber;i++){
            System.out.println("Enter the " +(i+1) +" student's name: ");
            String name = input.next();
            System.out.println("Enter the " + (i+1)+ " student's score: ");
            int score = input.nextInt();
            
            if (score > highestScore){
                secondHighestS = highestScore;
                secondHighest = highestName;
                highestName = name;
                highestScore = score;
            }
            else if (score > secondHighestS){
                secondHighestS = score;
                secondHighest = name;
            }
        }
       System.out.println("The student with highest score is: " + highestName + " wiht a score of: " + highestScore);
       System.out.println("The student with secondhighest score is: " + secondHighest + " wiht a score of: " + secondHighestS);
    }
    
}
