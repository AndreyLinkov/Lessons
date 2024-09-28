import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a three-digit number: ");
            if(input.hasNextInt()) {
                int number = input.nextInt();
                if(number<100 || number>999){
                    System.out.println("The number must be three digits!");
                } else {
                    int firstDigit = number/100;
                    int secondDigit = number/10%10;
                    int thirdDigit = number%10;
                    int result = firstDigit+secondDigit+thirdDigit;

                    System.out.println(firstDigit + "+" + secondDigit + "+" + thirdDigit + "=" + result);

                    input.close();
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        } while(true);
    }
}
