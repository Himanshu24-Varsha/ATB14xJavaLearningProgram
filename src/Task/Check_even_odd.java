package Task;
import java.util.Scanner;
public class Check_even_odd {//2)Check if a Number is Even or Odd.

       public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            if(n%2==0)
            {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }

