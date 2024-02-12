
package computearea;
import java.util.*;
public class ComputeArea {

    public static void main(String[] args) {
        System.out.println("Enter a double value of radius: ");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int area = (int) ((Math.pow(radius,2))*3);
        System.out.printf("The area of the rectangle is %d",area);
    }
    
}
