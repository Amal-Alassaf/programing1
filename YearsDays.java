
package yearsdays;
import java.util.Scanner;
public class YearsDays {
    public static void main(String[] args) {
        //promt the user to enter the number of seconds 
        System.out.println("Enter the number of seconds: ");
        Scanner input = new Scanner (System.in);
        long seconds = input.nextLong();
        // Calculate years by dividing the seconds by 60*60*24*365 which is equal to 31536000
        long years = seconds / 31536000;
        // Calculate days by dividing the reminder of seconds by 60*60*24 which is equal to 86400
        long days = ((seconds%31536000) / 86400);
        // Display the years and days 
        System.out.println(seconds + " seconds is approximately " + years + " years and " + days + " days");
    }
    
}
