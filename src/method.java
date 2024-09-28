import java.util.Scanner;

public class method {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNumber = checkIntInput("Enter the first number: ", input);
        int secondNumber = checkIntInput("Enter the second number: ", input);
        int thirdNumber = checkIntInput("Enter the third number: ", input);
        System.out.println("sum = " + sumNumber(firstNumber, secondNumber, thirdNumber));

        input.close();

    }

    public static int checkIntInput(String message, Scanner input) {

        do {
            System.out.print(message);
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Error!");
                input.next();
            }
        } while (true);

    }

    public static int sumNumber(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

}