import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        } else if (isDivByThree(num)) {
            System.out.println("Fizz");
        } else if (isDivByFive(num)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }
    }

    public static boolean isDivByThree(int val) {
        return (val % 3) == 0;
    }

    public static boolean isDivByFive(int val) {
        return (val % 5) == 0;
    }

    public static boolean isDivByThreeAndFive(int val) {
        return isDivByThree(val) && isDivByFive(val);
    }
}