
package investment;
import java.util.Scanner;
public class Investment {
    public static void main(String[] args) {
     // input investment rate,annual rate, number of years 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter investment amount: ");
     double investment = input.nextDouble();
     System.out.println("Enter annual interest rate in percentage: ");
     double annualRate = input.nextDouble();
     System.out.println("Enter number of years: ");
     int years = input.nextInt();
     
     // convert annual rate to monthly rate
     double monthlyRate = (annualRate/1200);
     
     // Apply the formula that calcluates the future
     double futureInvestmentValue = (investment * ( Math.pow((1+ monthlyRate),years*12)));
     
    // cast the value to display the final value with two dicemial places
     futureInvestmentValue = (int)(futureInvestmentValue * 100);
     futureInvestmentValue = futureInvestmentValue / 100.0;

     // Display the value
     System.out.println(" Accumulated value is $" + futureInvestmentValue );
    }
    
}
