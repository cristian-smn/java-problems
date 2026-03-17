import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        int hoursSlept = scanner.nextInt();

        if (hoursSlept >= lowerBound && hoursSlept <= upperBound) System.out.println("Normal");
        else if (hoursSlept < lowerBound) System.out.println("Deficiency");
        else System.out.println("Excess");
    }
}