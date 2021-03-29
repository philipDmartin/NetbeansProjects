
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number != 0) {
                sum += number;
                numbers++;
            } else {
                double dsum = Double.valueOf(sum);
                double dnumbers = Double.valueOf(numbers);
                
                double average = dsum / dnumbers;
                System.out.println("Average of the numbers: " + average);
                break;
            }
        }

    }
}
