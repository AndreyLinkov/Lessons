/*
 Напишите программу, которая выводит таблицу умножения для числа, введенного пользователем (от 1 до 10).
 */

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;

        while(check) {
            System.out.print("Enter a number from 1 to 10: ");
            if(input.hasNextInt()) {
                int number = input.nextInt();

                if(number<1 || number>10){
                    System.out.println("Error, number must be from 1 to 10.");
                } else {
                    check = false;
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println(i + "*" + number + "=" + i*number);
                    }
                    input.close();
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }
    }
}
