
package kilogramtopound;
public class KilogramToPound {
    public static void main(String[] args) {
        //print the header of the program
        System.out.println("Kilograms     pounds     |     pounds     Kilograms");
        //use a for statment to display the conversion
        for (int kg =1,p=20; (kg <= 199 && p<= 515 ); kg+= 2,p+=5){
             double pound = kg * 2.2;
             double kgs = p * 0.4545 ;
            System.out.printf("%5d %12.1f %7s %8d %13.2f ",kg,pound, '|', p, kgs);
            System.out.println();
        }
    }
}
    

