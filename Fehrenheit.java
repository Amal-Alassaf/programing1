
package fehrenheit;
import java.util.Scanner;
public class Fehrenheit {
    public static void main(String[] args) {
        System.out.println("Enter a degree in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double Fehrenheit = input.nextDouble();
        double Celsius = (5.0/9)*(Fehrenheit -32);
        System.out.println("Fahrenheit " + Fehrenheit + " is " + Celsius + "in celsius");
    }
    
}
