import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(input);
            } else {
                System.out.println("Input string is valid");
            }
        } catch (NOMATCHEXCP e) {
            System.out.println(e);
        }
    }
}