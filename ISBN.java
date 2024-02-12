package isbn;

import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        if (n1==0 || n2 == 0){
            System.out.println("Error: can't divide by zero");
        }
        else 
            System.out.println("The answer is: " + (n1/n2));


    }

    public static int[] arrayFill() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static boolean arrayCheck(int[] array, int[] array2) {
        boolean identical = false;
        if (array.length == array2.length) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array2[i])
                return true;
             else 
                return false;
            }

        }
        return identical;
    }

}
