package isbn;

public class HomeWorkLab9 {

    public static void main(String[] args) {
        char[] chars = randomChar();
        System.out.println("The lowercase letters are: ");
        printArray(chars);
        int [] count = countOccurence(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        printoccurence(count);
        

    }

    public static char[] randomChar() {
        char[] randomChar = new char[100];
        for (int i = 0; i < randomChar.length; i++) {
            randomChar[i] = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
        }
        return randomChar;
    }

    public static void printArray(char[] randomChar) {
        for (int i = 0; i < randomChar.length; i++) {
            if ((i + 1) % 20 == 0) 
                System.out.println(randomChar[i] + "  ");
             else 
                System.out.print(randomChar[i] + "  ");
            
        }
    }
    public static int[] countOccurence (char[]randomChar){
        int [] occurence = new int[26];
        for (int i=0 ;i<randomChar.length;i++){
            occurence[randomChar[i]-'a']++;
        }

        return occurence;
    }
    
    public static void printoccurence (int[]occurence){
        for (int i =0,j='a' ; i< 26 ; i++,j++){
            if ((i+1)%10==0)
                System.out.println(occurence[i] + " " + (char)(i+'a')+ " ");
            else
                System.out.print(occurence[i] + " " + (char)(i+'a')+ " ");
        }
    }
}
