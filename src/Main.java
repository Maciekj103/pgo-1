import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int liczba = random.nextInt(100) + 1;

        System.out.println("Wylosowana liczba to: " + liczba);

        if (liczba % 2 == 0) {
            System.out.println("Ta liczba jest parzysta!");
        } else {
            System.out.println("Ta liczba jest nieparzysta!");
        }

        System.out.println("Krótkie odliczanie do zera:");
        for (int i = 3; i >= 0; i--) {
            System.out.println(i + "...");
        }

        System.out.println("Gotowe!");
        System.out.println("Jakiś nowy log w konsoli, aby była jakaś zmiana...")
    }
}
