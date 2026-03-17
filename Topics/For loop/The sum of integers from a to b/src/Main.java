import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}