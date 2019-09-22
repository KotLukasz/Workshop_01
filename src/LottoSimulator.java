import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LottoSimulator {

	public static void main(String[] args) {

		int[] guessNumbers = new int[6];

		System.out.println("Welcome to Lotto Simulator");
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while (n < guessNumbers.length) {
			System.out.println("Please provide 6 numbers from 1 to 49");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("This is not a number" + "\n");
				System.out.println("Please provide 6 numbers from 1 to 49");
			}
			int temp = scanner.nextInt();
			int m = 0;
			if (temp > 0 && temp < 50) {
				for (int k = 0; k < n; k++) {
					if (guessNumbers[k] == temp) {
						m++;
						System.out.println("You have already provided that number" + "\n");
					}
				}
				if (m == 0) {
					guessNumbers[n] = temp;
					n++;
				}
			} else {
				System.out.println("Number is not from 1 to 49" + "\n");
			}
		}

		//Sorting Array
		//Arrays.sort(guessNumbers);
		for (int i = 0; i < guessNumbers.length; i++) {
			for (int j = 0; j < guessNumbers.length; j++)
				if (guessNumbers[i] < guessNumbers[j]) {
					int temp = guessNumbers[i];
					guessNumbers[i] = guessNumbers[j];
					guessNumbers[j] = temp;
				}
		}

		System.out.println("Picked Numbers");
		for (int temp : guessNumbers) {
			System.out.print(temp + " ");
		}

		Integer[] lottoArray;
		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		Collections.shuffle(Arrays.asList(arr));
		lottoArray = Arrays.copyOf(arr, 6);

		System.out.println("\n" + "Lotto Numbers");
		Arrays.sort(lottoArray);
		for (int temp : lottoArray) {
			System.out.print(temp + " ");
		}

		int guessedNumbers = 0;
		for (int i = 0; i < guessNumbers.length; i++) {
			for (int j = 0; j < lottoArray.length; j++) {
				if (guessNumbers[i] == lottoArray[j]) {
					guessedNumbers++;
				}
			}
		}

		if (guessedNumbers > 2) {
			System.out.println("\n" + "You have won Lotto with " + guessedNumbers + " numbers");
		} else {
			System.out.println("\n" + "You didn't win, you need at least 3 matches");
		}

	}

}




