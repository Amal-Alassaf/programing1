
package displaycalender;
import java.util.Scanner;
public class DisplayCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array = fillArray();
        printArray(array);
        System.out.println("The sum of the array is: " + sumArray(array));
        sumArrayByColumn(array);
        int [][] arrayRandom = fillRandomArray();
        printArray(arrayRandom);
        System.out.println("The sum of the array is: " + sumArray(arrayRandom));
        sumArrayByColumn(arrayRandom);
        
    }
    public static int sumArray(int [][]array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            for (int j=0 ; j<array[0].length ;j++){
            sum+= array[i][j];
            }
        }
        return sum;
    }
    public static void sumArrayByColumn (int [][]array){
         for (int j=0 ; j<array[0].length ;j++){
            int sum = 0;
            for (int i=0;i<array.length;i++){
            sum+= array[i][j];
            }
            System.out.println("The sum of column number " + (1+j) +" is "+ sum);

        }
    }
    public static void printArray (int [][]array){
        for (int i =0 ;i<array.length;i++){
            for (int j=0 ; j<array[0].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int [][] fillRandomArray (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the table's number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the table's number of columos: ");
        int col = input.nextInt();
        int [][] array = new int [rows][col];
        for (int i=0 ; i<array.length;i++){
            for (int j=0; j<array[0].length;j++){
                array[i][j]= (int)(Math.random()*100);
            }
        }
        return array;
    }
    public static int[][] fillArray(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the table's number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the table's number of columos: ");
        int col = input.nextInt();
        int [][] array = new int [rows][col];
        for (int i=0 ; i<array.length;i++){
            for (int j=0; j<array[0].length;j++){
                System.out.println("Enter the value of row " + (i+1)+ " and colume number " + (j+1));
                array[i][j]= input.nextInt();
            }
        }
        return array;
    }
}

    
    