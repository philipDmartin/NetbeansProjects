
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amount = 0;
        
        while(true) {
            System.out.println("Give a number:");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input < 0 || input > 0) {
                sum = input + input;
                amount = amount + 1;
            }
        }
        
        System.out.println("Number of numbers: " + amount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
