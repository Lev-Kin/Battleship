import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        if (str.length() % 2 == 0) {
            stringBuilder.append(str.substring(0, (str.length() / 2) - 1));
            stringBuilder.append(str.substring((str.length() / 2) + 1, str.length()));
        } else {
            stringBuilder.append(str.substring(0, str.length() / 2));
            stringBuilder.append(str.substring((str.length() / 2) + 1, str.length()));
        }

        System.out.println(stringBuilder);

    }
}