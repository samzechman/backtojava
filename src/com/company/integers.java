package com.company;
import java.util.Scanner;

public class integers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] variables = new int [4]; //array
        int i; //iterations
        boolean equals = false;

        for (i=0; i < 4; i++) {
            System.out.print("Enter a number: ");
            variables[i] = keyboard.nextInt();
        }

        for (i=1; i < 4; i++) {
            if (variables[i-1] == variables[i] ) {
                equals = true;
            }
            else {
                equals = false;
            }
        }

        if (equals == true) {
            System.out.print("equal");
        }
        else {
            System.out.print("not equal");
        }

    }
}
