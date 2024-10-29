import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("dane.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("Wpisz dane binarne: ");
                int data = scanner.nextInt();
                dos.writeInt(data);
            }

            dos.close();
            fos.close();


            FileInputStream fis = new FileInputStream("dane.bin");
            DataInputStream dis = new DataInputStream(fis);

            for (int i = 0; i < 3; i++) {
                int readData = dis.readInt();
                System.out.println("Odczytane dane: " + readData);
            }

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
