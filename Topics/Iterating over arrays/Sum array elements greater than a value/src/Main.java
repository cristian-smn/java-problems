import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int limitNumber = scanner.nextInt();
        scanner.close();

        System.out.println(numbersSum(numbers, limitNumber));
    }

    static int numbersSum(int[] numbers, int limitNumber) {
        int sum = 0;
        for (int number : numbers) {
            if (number > limitNumber) sum += number;
        }
        return sum;
    }
}