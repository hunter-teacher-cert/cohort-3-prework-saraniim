// allows for user input
import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Input temperature in Celsius from user 
        System.out.print("Enter temperature in Celsius: ");
        double cel = in.nextDouble();
        
        // Convert Celsius to Fahrenheit
        final double F = cel * (9.0 / 5) + 32;
        
        // Print result
        System.out.println(cel + " Celsius is " + F +" degrees Fahrenheit.");
       
    }
}