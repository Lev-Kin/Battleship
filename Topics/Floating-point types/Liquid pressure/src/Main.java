import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        final double h = scanner.nextDouble();
        final double g = 9.8;

        double p = d * g * h;

        System.out.println(p);
    }
}