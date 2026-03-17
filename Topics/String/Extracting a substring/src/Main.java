import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputStr = scanner.nextLine();
        int firstInt = scanner.nextInt();
        int lastInt = scanner.nextInt();

        String subStr = inputStr.substring(firstInt, lastInt + 1);
        System.out.println(subStr);
    }
}