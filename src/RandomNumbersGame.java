import java.util.Random;
import java.util.Scanner;

public class RandomNumbersGame {

	public static void main(String[] args) {

		//Generating random number between 1-100
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Guess number:");
			 while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("This is not a number" + "\n");
				System.out.println("Guess number:");
			}
			int temp = scanner.nextInt();
			if (temp < randomNumber) {
				System.out.println("Too small!" + "\n");
			} else if (temp > randomNumber) {
				System.out.println("Too big!" + "\n");
			} else {
				System.out.println("Finally you got it!");
				break;
			}
		}
	}

}



