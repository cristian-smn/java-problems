import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        int number = scanner.nextInt();
        scanner.close();
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);
    }
}