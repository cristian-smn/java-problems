import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (true) {
            String userInput = scanner.nextLine();
            try {
                input = Integer.parseInt(userInput);
                if (input != 0) {
                    System.out.println(10 * input);
                } else {
                    break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid user input: " + userInput);
            }
        }
    }
}