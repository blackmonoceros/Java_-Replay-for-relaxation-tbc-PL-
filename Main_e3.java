import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("liczby.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj 6 liczb:");
            for (int i = 0; i < 6; i++) {
                int liczba = scanner.nextInt();
                writer.write(liczba + "\n");
            }

            writer.close();


            System.out.println("Czy chcesz wczytac zapisane liczby? (tak/nie)");
            String odpowiedz = scanner.next();

            if (odpowiedz.equalsIgnoreCase("tak")) {
                File file = new File("liczby.txt");
                Scanner fileScanner = new Scanner(file);

                System.out.println("Wczytane liczby:");
                while (fileScanner.hasNextLine()) {
                    String linia = fileScanner.nextLine();
                    int liczba = Integer.parseInt(linia);
                    System.out.println(liczba);
                }

                fileScanner.close();
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Wystapil blad podczas zapisywania lub odczytywania pliku.");
        }
    }
}
