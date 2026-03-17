import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (-15 < number && number <= 12 || 14 < number && number < 17 || number >= 19) System.out.println("True");
        else System.out.println("False");
    }
}