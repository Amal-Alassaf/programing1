package passwordservices;

import java.util.Scanner;

public class PasswordServices {

    /* ********************************************** */
    public static void main(String[] args) {
        //Use a do-while loop to show the menu to the user along with a switch statement to select the required service
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our password services project");
        int service;
        do {
            System.out.println("To generate passwords, please enter 1.\nTo check the strength of your password, please enter 2.\nTo generate passwords and check their strenghts, please enter 3.\nTo exit the program, please enter 0");
            service = input.nextInt();
            //Check if the data is valid
            if (service > 3) {
                System.out.println("Error: Invalid entry");
            }
            switch (service) {
                case 0:// Which gives the user the option to exit the program
                    System.out.println("Message: Program ended");
                    break;
                case 1:// Which generates three random passwords of the chosen length by the user
                    System.out.println("Enter the length of the password: ");
                    double len = input.nextDouble();
                    // Check the validity of the length entered by the user
                    if (len % 1 == 0 && len >= 0) {
                        //Send the length of the password to the method "generatePasswords" and store it in an array
                        //Send the array to the method "printPasswords" to display the generated passwords
                        String[] array = generatePasswords(len);
                        printPasswords(array); 
                    } else {
                        System.out.println("Length should be a positive integer");
                    }
                    break;
                case 2:// Which promote the user to enter the password and check its strength
                    System.out.println("Enter your password");
                    //Read the password provided by the user
                    String password = input.next();
                    //Send the password to the method "checkStrength" and   
                    int score = checkStrength(password);
                    //send the score to the method to "printStrength" to display the result
                    printStrength(score);
                    break;
                case 3:// Which generate three passwords of a chosen length by the user and checks each password strength
                    System.out.println("Enter the length of the password: ");
                    double length = input.nextDouble();
                    if (length % 1 == 0 && length > 0) {
                        //Creat an array to store the passwords
                        String[] passwords = new String[3];
                        //Creat an array to store the scores of each password
                        int[] scores = new int[3];
                        //Invoke the method "generatePasswords" and send the entered length to it
                        passwords = generatePasswords(length);
                        //Use a for loop to find the score of each password by invoking the method "checkStrength" and store it in the scores array
                        for (int i = 0; i < scores.length; i++) {
                            scores[i] = checkStrength(passwords[i]);
                        }
                        //Send both arrays to the method "printPasswords" 
                        printPasswords(passwords, scores);
                    } else {
                        System.out.println("Length should be a positive integer");
                    }

            }
            System.out.println();
        } while (service > 0);
    }

    /* ********************************************** */
    /**
     * method generatePasswords uses the Math.random() method to randomly
     * generate three passwords of the chosen length
     *
     * @param len
     */
    public static String[] generatePasswords(double len) {
        //This method generate three random passwords of length chosen by the user 
        //Collect all possible characters in one string
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symboles = "@#$%^&*+=!";
        String possibleChoice = upperCaseLetters + lowerCaseLetters + digits + symboles;
        //Create an array to store the generated passwords
        String[] passwords = new String[3];
        for (int i = 0; i < passwords.length; i++) {
            //Use a for loop to generate the password of the required length
            String password = "";
            for (int j = 0; j < len; j++) {
                // get a random character's index by using Math.random
                int randomNumber = (int) (Math.random() * possibleChoice.length());
                //get the value of the index by using the method .charAt
                char randomChar = possibleChoice.charAt(randomNumber);
                password+= randomChar;
            }
            passwords[i] = password;
        }
        return passwords;
    }

    /* ********************************************** */
    /**
     * method printPasswords displays the content of the array of strings
     *
     * @param passwords: String array
     */
    public static void printPasswords(String[] passwords) {
        //Use a for-each loop to display the passwords 
        System.out.println("Here are a few options: ");
        for (String x : passwords) {
            System.out.println(x);
        }

    }

    public static void printPasswords(String[] passwords, int[] scores) {
        System.out.println("Here are a few options: ");
        //Use a for loop to display the password and its strength
        for (int i = 0; i < passwords.length; i++) {
            if (scores[i] == 5) {
                System.out.println(passwords[i] + "  This is a very good password!");
            } else if (scores[i] == 4) {
                System.out.println(passwords[i] + "  This is a good password, but you can still do better");
            } else if (scores[i] == 3) {
                System.out.println(passwords[i] + "  This is  a medium password, try making it better");
            } else {
                System.out.println(passwords[i] + "  This is a weak password, you should find a new one!");
            }
        }
    }


    /* ********************************************** */
    /**
     * method checkStrength calculates and returns the score of the given
     * password
     *
     * @param s
     */
    public static int checkStrength(String s) {
        int score = 0;
        //Use flag-controlled loop to evaluate each case only one time 
        boolean isUpperCase = false, isLowerCase = false, isDigit = false, isSymbol = false;
        if (s.length() >= 8) {
            score++;
        }
        //Use a for loop to evaluate each character in the password
        //Use an if statement inside the loop to determine when a point is given
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) && isUpperCase == false) {
                score++;
                isUpperCase = true;
            }
            if (Character.isLowerCase(s.charAt(i)) && isLowerCase == false) {
                score++;
                isLowerCase = true;
            }
            if (Character.isDigit(s.charAt(i)) && isDigit == false) {
                score++;
                isDigit = true;
            }
            if (isSymbol(s.charAt(i)) && isSymbol == false) {
                score++;
                isSymbol = true;
            }
        }
        return score;
    }

    public static boolean isSymbol(char symbol) {
        //This method checks if a certain character is a symbol
        boolean isSymbol;
        isSymbol = symbol == '@' || symbol == '#' || symbol == '$' || symbol == '%' || symbol == '^' || symbol == '&' || symbol == '*' || symbol == '+' || symbol == '=' || symbol == '!';
        return isSymbol;
    }

    /* ********************************************** */
    /**
     * method printStrength prints the corresponding strength to the given score
     *
     * @param score
     */
    public static void printStrength(int score) {
        //This method prints a specific message depending on the score of the password using a multi way if statement
        if (score == 5) {
            System.out.println("This is a very good password!");
        } else if (score == 4) {
            System.out.println("This is a good password, but you can still do better");
        } else if (score == 3) {
            System.out.println("This is  a medium password, try making it better");
        } else {
            System.out.println("This is a weak password, you should find a new one!");
        }

    }
}
