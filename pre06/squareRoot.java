import java.util.Scanner;

public class squareRoot {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
    // Create a Scanner

		// Prompt user to enter a number
		System.out.print("Enter a number: ");
		double number = input.nextDouble();

		// Display the square root
		System.out.println(
			"The approximate square root of " + number + " is: " + sqrt(number));
	}
	
	/** Method squrt approximates the square root of n */
	public static double sqrt(double n) {
		double guess = 1;	// Initial guess to positive value
		double nextGuess = (guess + n / guess) / 2; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// return nextGuess as the approximated square root of n.
		while (nextGuess - guess > 0.0001) {
			guess = nextGuess;
			nextGuess = (guess + n / guess) / 2;
		}
		guess = nextGuess;
		return nextGuess = (guess + n / guess) / 2;
	}
}
