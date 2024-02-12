
package runwaylength;
import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args) {
        
        //input v,a
        System.out.println("Input a dounle value of v and a respectfully");
        double v = 1,a = 2;
        double Length = 1;
        Scanner input = new Scanner(System.in);
        v = input.nextDouble();
        a = input.nextDouble();
        
        //calculate Length
        Length = (Math.pow(v,2))/(2*a);
        
        //print runway Length
        System.out.println("The minimum runway length for this airplane is " + Length);
    }
    
}
