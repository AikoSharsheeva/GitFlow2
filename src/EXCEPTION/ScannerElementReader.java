package EXCEPTION;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerElementReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("element1 element2 element3");
        String nextElement = readNextElement(scanner);

        if (!nextElement.isEmpty()) {
            System.out.println("Next Element: " + nextElement);
        } else {
            System.out.println("No more elements to read.");
        }
    }

    public static String readNextElement(Scanner scanner) {
        try {
            return scanner.next();
        } catch (NoSuchElementException e) {
            System.err.println("Error: No more elements to read.");
            return "";
        }
    }
}
