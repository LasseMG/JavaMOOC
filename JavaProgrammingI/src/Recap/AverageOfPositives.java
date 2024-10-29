package Recap;

import java.util.Scanner;

public class AverageOfPositives {
    /*
    Write a program that asks user for input until the user inputs 0.
    After this, the program prints the average of the positive numbers
    (numbers that are greater than zero).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast tal: ");

        int sum = 0;
        int input = scanner.nextInt();

        while (input != 0) {
            if (input <= -1) {
                System.out.println("Skal være større end 0");
            } else {
                sum += input;
            }
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
