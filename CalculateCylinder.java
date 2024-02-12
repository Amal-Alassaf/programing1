
package calculatecylinder;
import java.util.Scanner;
public class CalculateCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 values: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("%s %.2f \n","The avarge of your values is: " , average(array));
    }
    public static int average(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        int average = (int) (sum / array.length);
        return average;
    }
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        double avarage = (sum / array.length);
        return avarage;
    }
}


