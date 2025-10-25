package Task;

import java.util.Scanner;

public class Check_Scenior_citize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of senior");
        int age = scanner.nextInt();

        if(age<0)
        {
            System.out.println("Not a valid age");
        }
        else if (age>0 && age<14){
            System.out.println("Teenager");

        }
        else if (age>18 && age<64){
            System.out.println("Adult");
        }
        else if (age>=65){
            System.out.println("senior citizen");
        }

    }
}
