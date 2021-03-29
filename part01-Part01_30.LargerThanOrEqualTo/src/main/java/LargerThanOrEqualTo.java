
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int input1 = Integer.valueOf(scan.nextLine());
   
        System.out.println("Give the second number:");
        int input2 = Integer.valueOf(scan.nextLine());
        
        if(input1 > input2) {
            System.out.println("Greater number is " + input1);
        }
        else if(input2 > input1) {
            System.out.println("Greater number is " + input2);
        }
        else if(input1 == input2) {
            System.out.println("The numbers are the equal!");
        }
            
    }
}
