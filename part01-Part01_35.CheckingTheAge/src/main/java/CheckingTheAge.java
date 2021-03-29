
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how old are you?");
        
        int input = Integer.valueOf(scan.nextLine());
        
        if(input >= 10 && input <= 55) {
            System.out.println("ok");
        }
        else if(input < 10 || input > 55) {
            System.out.println("Impossible");
        }
    }
}
