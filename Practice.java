package practice;
//import java.util.Scanner;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6}; 
        int[] rArray = new int[array.length];
        rArray = reverse(array);
        System.out.println(Arrays.toString(rArray));
    }
    public static double sum(double ...numbers){
        double sum =0;
        for (int i =0 ; i < numbers.length; i++){
            sum+= numbers[i];
        }
        return sum;
    }
    public static int linearSearch (int[] array ,int key){
        for (int i=0 ; i<array.length;i++){
            if (array[i]== key)
                return i;
        }
        return -1;
    }
    public static int[] sorting (int[]array){
        int min = array[0];
        int i =0;
        for (i =0 ; i<array.length-1;i++){
            array[i]=min;
            for (int j=i+1 ; j<array.length;j++){
                if (array[j]<min)
                min = array[j];
            }
        }

        return array;
    }
    public static int[] reverse(int[]array){
        int[] rArray = new int[array.length];
        for (int i =0,j = array.length-1;i<array.length;i++,j--){
            rArray[j]= array[i];
    }
        return rArray;
    }
}

