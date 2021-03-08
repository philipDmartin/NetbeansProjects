
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String inputS = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int inputI = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        Double inputD = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        Boolean inputB = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + inputS);
        System.out.println("You gave the integer " + inputI);
        System.out.println("You gave the double " + inputD);
        System.out.println("You gave the boolean " + inputB);
    }
}
