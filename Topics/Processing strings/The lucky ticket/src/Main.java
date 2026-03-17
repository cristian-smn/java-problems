import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < (userInput.length() / 2); i++) {
            sumLeft += Character.getNumericValue(userInput.charAt(i));
            sumRight += Character.getNumericValue(userInput.charAt(userInput.length() - i - 1));
        }

        if (sumLeft == sumRight) {
            System.out.println("Lucky");
        }
        else {
            System.out.println("Regular");
        }
    }
}
