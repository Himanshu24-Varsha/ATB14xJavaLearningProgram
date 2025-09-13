public class Reverse_string {

        public static void main(String[] args) {
            String input = "Hello World";
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }
    }

