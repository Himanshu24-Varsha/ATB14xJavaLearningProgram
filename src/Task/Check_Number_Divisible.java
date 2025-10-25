package Task;

import java.util.Scanner;

public class Check_Number_Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " divisible by 5 and 11");
        } else {
            System.out.println(num + " not divisible by 5 and 11");
        }
    }
}
