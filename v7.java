import java.util.Scanner;

public class v7 {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // output the prompt
        System.out.println("Enter the line of text: ");

        // wait for the user to enter a line
        //String line = input.nextLine();

        // wait for the user to enter a floating value
        double value = input.nextDouble();

        // tell them what they entered
        System.out.println("You entered: " + value);
        
    }
}
