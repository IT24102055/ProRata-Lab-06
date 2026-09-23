import java.util.Scanner;

public class IT24102055Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate square and square root
        double square = number * number;
        double squareRoot = Math.sqrt(number);

        // Display the results
        System.out.println("The square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);
        
        scanner.close();
    }
}
