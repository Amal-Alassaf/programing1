
package lottery;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        int g1 = num / 10 ;
        int g2 = num % 10 ;
        System.out.println(" The lottery number is :" + num);
        System.out.println("Enter your lottery pick ( two numbers) : ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int d1 = answer / 10 ;
        int d2 = answer % 10 ;
        
        if (g1 == d1 && g2 == d2 ){
            System.out.println("congrats you got a $10,000");
        }
        else if (g1 == d2 && g2 == d1){
            System.out.println("congrats you got a $3,000");
        }
            
        else if (g1 == d1 ^ g2 == d2 || g1 == d2 ^ g2 == d1){
            System.out.println("congrats you got a $1,000");
        }
        
        else {
        System.out.println("sorry, no match ");
        }

    }
    
}
