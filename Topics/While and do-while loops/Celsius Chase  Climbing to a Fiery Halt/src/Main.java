import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed

        // Add your while loop or do-while loop here to process input temperatures

        int temp = scanner.nextInt();
        while (temp < 100) {
            if (maxTemperature < temp) maxTemperature = temp;
            temp = scanner.nextInt();
        }
        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}