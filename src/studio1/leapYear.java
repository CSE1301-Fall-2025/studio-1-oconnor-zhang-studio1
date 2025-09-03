package studio1;
import java.util.Scanner;

public class leapYear {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = in.nextInt();
        boolean isLeapYear;
        if ((year % 4 == 0 ) && (year % 100 != 0 ) || (year % 400 == 0)) {
            isLeapYear = true;
            System.out.println(year + " is a leap year: " + isLeapYear);
        }
        else {
            isLeapYear = false;
            System.out.println(year + " is not a leap year: " + isLeapYear);
        }



}
}
