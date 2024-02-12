
package exerciselab10;
public class Example1Lab11 {
    public static void main(String[] args) {
        int [] myFirstArray ;
        double [] mySecondArray = new double[5];
        mySecondArray[0]= 5.6;
        mySecondArray[1]= 4.5;
        mySecondArray[2]= 3.3;
        mySecondArray[3]= 13.2;
        mySecondArray[4]= 4.0;
        mySecondArray[0] += 20;
        System.out.println("THe first index is " +mySecondArray[0] + "\nand the middle index is "+ mySecondArray[2] + "\nand the last index is " + mySecondArray[4]);
    }  
}
