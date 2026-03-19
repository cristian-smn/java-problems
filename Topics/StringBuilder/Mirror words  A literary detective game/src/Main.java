import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();

        // Implement palindrome check here
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(input);
        while (true) {
            int index = sb.indexOf(" ");
            if (index == -1) break;
            sb.deleteCharAt(index);
        }
        String string1 = sb.toString();
        String string2 = sb.reverse().toString();
        isPalindrome = string1.equals(string2);
        // Print result
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}