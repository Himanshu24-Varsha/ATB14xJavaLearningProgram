package Task;

import java.util.Scanner;

public class Convert_Days_to_Years_Months_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Days value");
        int totalDays = scanner.nextInt();

        int years = 0, months = 0, days = 0;

        if (totalDays >= 0) {
            years = totalDays / 365;   // 1 year = 365 days
            totalDays = totalDays % 365;

            months = totalDays / 30;   // 1 month = 30 days
            totalDays = totalDays % 30;

            days = totalDays;          // remaining days

            System.out.println("Equivalent Time:");
            System.out.println(years + " Year(s), " + months + " Month(s), and " + days + " Day(s).");
        } else {
            System.out.println("Invalid input! Days cannot be negative");
        }
    }
}
