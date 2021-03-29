
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int resultA = num1 + num2;
        int resultS = num1 - num2;
        int resultM = num1 * num2;
        int resultD = num1 / num2;
        
        System.out.println(num1 + " + " + num2 + " = " + resultA);
        System.out.println(num1 + " - " + num2 + " = " + resultS);
        System.out.println(num1 + " * " + num2 + " = " + resultM);
        System.out.println(num1 + " / " + num2 + " = " + resultD);

    }
}
