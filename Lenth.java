
package lenth;
import java.util.Scanner;
public class Lenth {
    public static void main(String[] args) {
        // promot the user to enter speed and acceleration
        System.out.println("Enter speed and acceleration: ");
        Scanner input = new Scanner (System.in);
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        // Calculate length by the given formula
        double length = (Math.pow(speed,2) / (2*acceleration));
        // Display length 
        System.out.println("The minimum runway length for this airplane is " + (int)(length *1000)/1000.0);
    }
    
}
