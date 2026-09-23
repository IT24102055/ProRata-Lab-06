import java.util.Scanner;

public class IT24102055Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumOfSquares = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.printf("The Root Mean Square (RMS) is: %.10f%n", rms);
        } else {
            System.out.println("No positive integers were entered.");
        }
    }
}
