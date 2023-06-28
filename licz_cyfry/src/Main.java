import java.util.Scanner;

//  to jest bardzo szkodliwy kod
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź swoje imię: ");
        String imie = scanner.nextLine();

        System.out.println("Witaj, " + imie + "!");

        System.out.print("Wprowadź liczbę: ");
        int liczba = scanner.nextInt();

        int iloscCyfr = obliczIloscCyfr(liczba);

        System.out.println("Liczba cyfr w liczbie: " + iloscCyfr);
    }

    public static int obliczIloscCyfr(int liczba) {
        if (liczba == 0) {
            return 1; // Jeśli liczba to 0, zwracamy 1 jako ilość cyfr
        }

        int ilosc = 0;
        while (liczba != 0) {
            ilosc++;
            liczba /= 10;
        }

        return ilosc;
    }
}