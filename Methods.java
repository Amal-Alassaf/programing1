
package methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double[] array = new double[10];
       for (int i =0 ; i<10 ; i++){
           System.out.println("Enter  the " + (i+1) + " value: ");
           array[i] = input.nextDouble();
       }
       System.out.println("The minimum number is: " + min (array));
        
        
    }
    public static double min(double[] array){
        double min = array[0];
    for (double x : array){
        if (x<min)
            min = x;
    }
    return min;
    }
}


