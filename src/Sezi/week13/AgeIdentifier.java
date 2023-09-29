package Sezi.week13;

import java.util.Scanner;

public class AgeIdentifier {
}


class AgeVerifier {
    public static void verifyAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Age verification successful");
        }
    }

    public static void main(String[] args) {
        try {
            verifyAge(25); // Testing with a valid age
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            verifyAge(-5); // Testing with a negative age
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            verifyAge(16); // Testing with an age less than 18
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

