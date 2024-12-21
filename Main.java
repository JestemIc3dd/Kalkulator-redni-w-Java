import java.util.Scanner;

public class Main {
    private static int suma;
    private static int przedmioty;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość przedmioty");
        przedmioty = sc.nextInt();

        for (int i = 0; i < przedmioty; i++) {
            System.out.println("Podaj ocene z " + (i + 1) + " przedmiotu");
            suma += sc.nextInt();
        }
        Double srednia = oblicz_srednia(suma, przedmioty);

        System.out.println("Twoja średnia: " + srednia);
    }

    private static double oblicz_srednia(int suma, int ilosc_przedmiotow) {
        return (double) suma / ilosc_przedmiotow;
    }
}