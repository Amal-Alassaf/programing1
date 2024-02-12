
package qiez2;
import java.util.Scanner;
public class Qiez2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();
        System.out.println("The string has " + number(word) + " words");

    }
    public static int number(String word){
        int nWords = 1;
        for(int i =0;i < word.length();i++){
            if (word.charAt(i)== ' ')
            nWords++;
        }  
        return nWords;
    }
}
