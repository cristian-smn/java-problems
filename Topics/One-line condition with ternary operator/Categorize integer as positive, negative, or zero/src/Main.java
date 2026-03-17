import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int num = scanner.nextInt();

        System.out.println(num == 0 ? "Zero" :
                            num > 0 ? "Positive" : "Negative");
        // Use a ternary operator to check if the integer is positive, negative or zero
        // and print the corresponding message

    }
}