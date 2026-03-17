import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = a; i <= b; i++) {
            String output = "";
            if ((i % 3) == 0) {
                output += "Fizz";
            }
            if ((i % 5) == 0) {
                output += "Buzz";
            }
            System.out.println((output.isEmpty()) ? i : output);
        }
    }
}