import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		int numberToGuess;
		int min = 0;
		int max = 1000;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Think of a number from 0 to 1000 and I will guess it in maximum of 10 tries: ");

		while (true) {
			numberToGuess = (max - min) / 2 + min;
			System.out.println("I'm guessing it's: " + numberToGuess);
			System.out.println("Please if it's 'higher', 'lower' or did I 'guess' it?");
			String temp = scanner.next();
			if (temp.equals("guess")) {
				System.out.println("I've won");
				break;
			} else if (temp.equals("higher")) {
				min = numberToGuess;
			} else if (temp.equals("lower")) {
				max = numberToGuess;
			} else {
				System.out.println("Please specify: 'higher', 'lower', 'guess'");
			}
		}
	}

}




