import java.util.Random;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class Guess {

    public static void main(String[] args) {

      //intro guessing
        System.out.println("I'm thinking of a number between 1 and 100 (including both).\nCan you guess what it is?");
        
        int random, guess;
        Scanner in = new Scanner(System.in);
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
       
        // Input guess from user 
        System.out.print("Type a number:");
        System.out.print("Your guess is:" \ );
        

       
        System.out.println(number);
    }

}