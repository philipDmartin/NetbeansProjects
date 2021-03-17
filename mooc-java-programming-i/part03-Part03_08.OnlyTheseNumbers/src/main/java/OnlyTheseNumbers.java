
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("To where? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        if(start == numbers.get(2) && end == numbers.get(3)) {
            System.out.println(numbers.get(2));
            System.out.println(numbers.get(3));
        }  
    } 
}
