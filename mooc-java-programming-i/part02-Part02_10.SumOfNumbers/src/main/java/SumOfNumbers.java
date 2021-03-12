
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        while(true) {
            System.out.println("Give a number: (0) exits");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input < 0 || input > 0) {
                sum = input + input;
            }
        }
        
        System.out.println("Sum of inputs = " + sum);
    }
}
