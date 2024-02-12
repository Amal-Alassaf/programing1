
package chart;
import java.util.Scanner;
public class Chart {

    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        char x = name.charAt(0);
        name = name.substring(1, name.length()) + x + "io";
        System.out.println(name);
        
    }
    
}
