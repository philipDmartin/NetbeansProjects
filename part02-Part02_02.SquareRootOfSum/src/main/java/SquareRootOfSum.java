
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());
        
        int sum = input1 + input2;
        
        double sqRt = Math.sqrt(sum);
        
        System.out.println(sqRt);

    }
}
