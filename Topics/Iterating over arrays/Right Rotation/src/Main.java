import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        if (arr.length == 0) return;
        steps %= arr.length;
        if (steps == 0) return;

        reverseElements(arr, 0, arr.length);
        reverseElements(arr, 0, steps);
        reverseElements(arr, steps, arr.length);
    }

    private static void reverseElements(int[] array, int startLimit, int endLimit) {
        int left = startLimit, right = endLimit - 1;
        while (left < right) {
            swapElementsByIndex(array, left++, right--);
        }
    }

    private static void swapElementsByIndex(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}