import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double area = 0;
        Scanner scanner = new Scanner(System.in);

        String floorShape = scanner.next();
        switch (floorShape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.print(area);
                break;
            case "rectangle":
                 double w = scanner.nextDouble();
                 double h = scanner.nextDouble();

                area = w * h;
                System.out.print(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double pi = 3.14;

                area = pi * r * r;
                System.out.print(area);
                break;
        }
        scanner.close();
    }
}