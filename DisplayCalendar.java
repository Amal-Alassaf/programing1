
/*package leapyeartest;
public class LeapYearTest {
    public static void main(String[] args) {
        System.out.println("The number of days in the year 2000 to 2010 is: ");
        int days = 0;
        int sumDays = 0;
        for (int year = 2000 ; year <=2010 ; year++){
            // invoke the method to get the number of days per year
            days = numberOfDaysInAYear(year);
            // add the number of days per year to the total number of days per years from 2000 to 2010
            sumDays += days;
        }
        System.out.println(sumDays);
        
    }
    public static int numberOfDaysInAYear(int year){
        int days = 0;
        // check whether a year is leap year or not 
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            days = 366;
        else 
            days = 365;
        return days;
    }
    
}*/

import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year (1-7): ");
        int fDay = input.nextInt();
        input.close();
        // invoke the method to display the calendar
        printCalendar(year, fDay);
    }

    public static void printCalendar(int year, int fDay) {
        int[] numberOfDaysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // find each month's number of days by using switch statement
        // use a for statement to print the days of the month
        for (int month = 1; month <= 12; month++) {
            System.out.printf("%21s %d\n", getMonthName(month - 1), year);
            System.out.println("_________");
            System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            // use a for statement to display the first month starting with the first day of the year
            if (month == 1) {
                for (int i = 1; i <= fDay; i++) {
                    System.out.print("     ");
                }
                for (int i = 1; i <= numberOfDaysPerMonth[month]; i++) {
                    if ((i + fDay - 1) % 7 == 0)
                        System.out.printf("%-5d\n", i);
                    else
                        System.out.printf("%-5d", i);
                }
            } else {
                // use another for statement to display the days of the rest months
                for (int i = 1; i <= numberOfDaysPerMonth[month]; i++) {
                    if ((i + fDay - 1) % 7 == 0)
                        System.out.printf("%-5d\n", i);
                    else
                        System.out.printf("%-5d", i);
                }
            }
            System.out.println("\n");
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return monthNames[month];
    }
}
