package Recap;

import java.util.Objects;
import java.util.Scanner;

public class Cubes {
    /*
    Write a program that reads strings from the user until the user inputs the string "end".
    As long as the input is not "end" the program should handle the input as an integer
    and print the cube of the integer (meaning number * number * number).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        System.out.println("Program startet, indtast tal:");

        while (!Objects.equals(userInput, "end")) {
            userInput  = scanner.nextLine();
            if (!Objects.equals(userInput, "end")) {
                int number = Integer.parseInt(userInput);
                System.out.println(number * number * number);
            }
        }
    }
}
