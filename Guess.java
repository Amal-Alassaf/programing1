package guess;
import java.util.*;
public class Guess{
 public static void main (String []args){
     System.out.println("Enter your guess as 0 for head and 1 for tail");
     Scanner input = new Scanner (System.in);
     int guess = input.nextInt();
     // genrate 0 or 1
     int guess1 = (int)(Math.random()*2);
     boolean b;
     //check if the user's guess matches the genrated number
     if (guess == 0 && guess1==0){
     System.out.println("your guess is correct, it is head ");
      }
     else if (guess == 0 && guess1== 1)
     System.out.println("your guessis incorrect, it is tail ");
     boolean n ;
     if (guess == 1 && guess1 == 1){
     System.out.println("your guess is correct, it is tail");
     }
     else if (guess == 1 && guess1== 0)
     System.out.println("your guess is incorrect , it is head");
     
 }
}
