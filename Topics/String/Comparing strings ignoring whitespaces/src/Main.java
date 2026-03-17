import java.util.Scanner;

class Main {

    private static String eraseWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();


        System.out.println(eraseWhitespace(str1).equals(eraseWhitespace(str2)));
    }
}