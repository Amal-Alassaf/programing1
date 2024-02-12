package isbn;

import java.util.Scanner;

public class HomeWordLab10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s %.2f \n", "The area of the pentagon with (5, 5.5) is:", CalculateAreaPentagon(5, 5.5));
        System.out.printf("%s %.2f\n", "The area of the pentagon with (8, 2.3) is:", CalculateAreaPentagon(8, 2.3));
        //Promote the user to enter the number of sides and the length of them
        System.out.println("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();
        // check if the number of side is an integer number 
        if (numberOfSides % 1 == 0) {
            System.out.println("Enter the length of the sides: ");
            double length = input.nextDouble();
            //Display the result by invoking the method 
            System.out.printf("%s %.2f\n", "The area of the pentagon is:", CalculateAreaPentagon(numberOfSides, length));
        } else {
            System.out.println("The number of sides should be positive intger");
        }

    }

    public static double CalculateAreaPentagon(double numberOfSides, double sideLength) {
        double area = 0;
        // Calculate the area of the pentagon by the formula
        double numerator = ((int) numberOfSides) * (Math.pow(sideLength, 2));
        double denominator = 4 * (Math.tan(Math.PI / numberOfSides));
        area = numerator / denominator;
        return area;
    }
}
