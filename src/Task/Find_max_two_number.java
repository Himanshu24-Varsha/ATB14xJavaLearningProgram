package Task;
import java.util.Scanner;
public class Find_max_two_number {

    public static void main(String[] args) {
//3) Find the Maximum of Two Numbers.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers :");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = 0;
            if(a > b)
            {
                max = a;
            }
            else
            {
                max = b;
            }
            System.out.println("Max of the two number is : " + max);
        }
    }

