import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź swoje imię: ");
        String imie = scanner.nextLine();

        System.out.println("Witaj, " + imie + "!");

        System.out.print("Wprowadź słowo: ");
        String slowo = scanner.nextLine();

        int dlugosc = slowo.length();

        System.out.println("Liczba liter w słowie: " + dlugosc);
    }
}