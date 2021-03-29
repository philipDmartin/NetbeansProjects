
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("pasword?");
        String input1 = scan.nextLine();
        
        if(input1.equals("Caput Draconis")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("off with you!");
        }
    }
}
