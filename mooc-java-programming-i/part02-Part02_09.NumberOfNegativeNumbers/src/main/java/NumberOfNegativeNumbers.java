
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negNum = 0;
        
        while(true) {
            System.out.println("Give a number: (0) exits");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input < 0) {
                negNum = negNum + 1;
            }
        }
        
        System.out.println("Total negitage numbers = " + negNum);
    }
}
