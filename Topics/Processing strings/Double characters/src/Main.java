import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        char[] strChr = new char[2 * userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            strChr[2 * i] = userInput.charAt(i);
            strChr[2 * i + 1] = userInput.charAt(i);
        }
        String outputStr = String.valueOf(strChr);
        System.out.println(outputStr);
    }
}