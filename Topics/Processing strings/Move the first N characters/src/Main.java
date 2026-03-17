import java.util.Scanner;

class Main {

    private static String strPermutation (String str, int steps) {
        if (steps >= str.length()) return str;
        String leftStr = str.substring(0, steps);
        String rightStr = str.substring(steps);
        return rightStr + leftStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int n = scanner.nextInt();

        System.out.println(strPermutation(userInput, n));
    }
}