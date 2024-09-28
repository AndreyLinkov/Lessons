/*
Напишите программу, которая запрашивает у пользователя целое число `n`
и выводит все четные числа от 1 до `n`.
 */

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter the number: ");
            if(input.hasNextInt()) {
                int number = input.nextInt();

                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }
        input.close();
    }
}