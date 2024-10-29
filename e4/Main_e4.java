import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String[] questions = {
			"What is the area of Poland? ",
			"How many inhabitants does Poland have? ",
			"The largest city in Poland? ",
			"The longest river in Poland? ",
			"Does Poland have access to the sea? ",
			"How tall is the highest peak in Poland? ",
			"Does Poland border Germany? ",
			"What is the official language in Poland? "

		};

		File file = new File("answers.txt");

		try {

			Scanner scanner = new Scanner(file);

			for (int i = 0; i < questions.length; i++) {
				String question = questions[i];
				String reply = scanner.nextLine();

				System.out.println(question + ": " + reply);

			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");

		}

	}
}