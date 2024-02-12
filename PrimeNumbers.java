
package primenumbers;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of prime numbers: ");
        int num = input.nextInt();
        System.out.println("The first " + num + " prime numbers are:");
        primeNumbers(num);
        

        
    }   
    public static void primeNumbers (int numberOfPrimes){
        int num = 1;
        int primes = 0;
                while (primes < numberOfPrimes){
        
            if (prime(num)== true){
                primes++;
              if (primes % 10 == 0){
                System.out.println(num);
              }
                else 
                System.out.print ( " " + num + " ");         
            }
        num++;
     }
        
    }        

    public static boolean prime (int num){
            boolean isPrime = true;
            for (int i = 2; i < num;i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
            }
        }
            return isPrime;
}
}
