package Task;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Number_of_words_string {

        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The String I will count the words");
            String userInput= sc.nextLine();
            String[] S1= userInput.split(" ");
            int count =0;
            for(String s:S1) {
                count++;
            } System.out.println(count);
        }}

