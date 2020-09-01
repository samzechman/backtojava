package com.company;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i;
        int length;

        System.out.print("How many numbers will be in your array? ");
        length = keyboard.nextInt();

        int[] variables = new int [length]; //array


        for (i=0; i < variables.length; i++) {
            System.out.print("Enter a number: ");
            variables[i] = keyboard.nextInt();
        }

        for (i = (variables.length - 1); i >= 0; i--) {
            System.out.print(variables[i]);
        }


    }
}
