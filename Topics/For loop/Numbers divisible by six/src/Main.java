import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum += x % 6 == 0 ? x : 0;
        }
        scanner.close();
        System.out.println(sum);
    }
}