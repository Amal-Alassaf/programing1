package isbn;

import java.util.Scanner;

public class HomeWordLab12 {

    public static void main(String[] args) {
        //promote the user to enter 10 values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 values: ");
        //Store the data in an array by using a for-each loop
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        //Display the avarege of the values by invoking the method "average"
        System.out.printf("%s %.2f \n","The avarge of your values is: " , average(array));

    }

    public static int average(int[] array) {
        // Find the sum of values of the array by using for-each loop
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        //Use the sum to find the average
        int average = (int) (sum / array.length);
        return average;
    }

    public static double average(double[] array) {
        // Find the sum of values of the array by using for-each loop
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        //Use the sum to find the average
        double avarage = (sum / array.length);
        return avarage;
    }

}
