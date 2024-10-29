import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();


        try {
            FileWriter writer = new FileWriter("dane.txt");
            writer.write("Imię: " + imie + "\n");
            writer.write("Nazwisko: " + nazwisko + "\n");
            writer.write("Wiek: " + wiek + "\n");
            writer.close();
            System.out.println("Dane zostaly zapisane do pliku dane.txt.");
        } catch (IOException e) {
            System.out.println("Wystąpił bląd podczas zapisu do pliku.");
            e.printStackTrace();
        }


        System.out.print("Czy wczytac dane z pliku dane.txt? (tak/nie): ");
        String odpowiedz = scanner.next();

        if (odpowiedz.equalsIgnoreCase("tak")) {
            try {
                File file = new File("dane.txt");
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }

                fileScanner.close();
                System.out.println("Dane zostaly wczytane.");
            } catch (IOException e) {
                System.out.println("Wystapil blad podczas wczytywania danych z pliku.");
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
