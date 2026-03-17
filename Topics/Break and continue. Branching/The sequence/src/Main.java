import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        int number = 1;
        while (i <= n) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number + " ");
                i++;
                if (i > n) break;
            }
            number++;
        }
    }
}