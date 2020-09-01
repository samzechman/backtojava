package com.company;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double fahrenheit;
        double celcius;

        System.out.print("Input a degree in Fahrenheit: ");
        fahrenheit = keyboard.nextDouble();

        celcius = (fahrenheit - 32) * (5.0/9);

        System.out.print(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celcius.");

    }
}
