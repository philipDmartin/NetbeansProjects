
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;
        
        while(true) {
            System.out.println("Give a number: (0) exits");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input < 0 || input > 0) {
                ones = ones + 1;
            }
        }
        
        System.out.println("Total inputs = " + ones);
    }
}
