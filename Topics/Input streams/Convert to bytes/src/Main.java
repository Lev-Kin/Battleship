import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        StringBuilder stringBuilder = new StringBuilder();

        int charAsNumber = inputStream.read();
        while (charAsNumber != -1) {
            byte b = (byte) charAsNumber;
            System.out.print(b);
            charAsNumber = inputStream.read();
        }
    }
}