
package sum;
public class Sum {
    public static void main(String[] args) {
        int sum = 0 ;
        
        for (int i = 1 ; i <=1000 ; i++){
            if (i%2==0)
                continue;
            sum +=i;
            if (sum > 500)
                break;
        }
        System.out.println("sum = " + sum);
    }
    
}
