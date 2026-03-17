import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");
        scanner.close();

        boolean isAlphabetical = true;
        for (int i = 0; i < userInput.length - 1; i++) {
            if (userInput[i].compareTo(userInput[i+1]) > 0) {
                isAlphabetical = false;
                break;
            }
        }
        System.out.println(isAlphabetical);
    }
}