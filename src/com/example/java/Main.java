package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double temperature = 95.0; //Declaring the temperature as double
        double guess = 0.0; // 0.0 for the user input

        Scanner scanner = new Scanner(System.in);//scanner for user input


        while (guess != temperature){  //While saying guess is not equal to temperature

            System.out.println("Enter your temperature: "); // Printing statement for the user to enter input

            guess = scanner.nextFloat();

            // These are the if/else if statements that will print the result depending on what the user input is.

            if (guess < 92.0) {
                System.out.println("too low");
            }
            else if(guess <= 99.5){
                System.out.println("normal");
            }
            else if(guess > 99.5){
                System.out.println("Too High");
            }


        }
    }
}

