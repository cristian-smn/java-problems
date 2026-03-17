import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessfull = isWeekend ? 15 <= number && number <= 25 : 10 <= number && number <= 20;
        System.out.println(isSuccessfull);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
    }
}