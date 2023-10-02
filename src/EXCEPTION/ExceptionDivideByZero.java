package EXCEPTION;

public class ExceptionDivideByZero {
    public static void main(String[] args) {
        /*Description: Handling Division by Zero
Create a method called divideNums(), that takes two int params.
Method should return the result of first num being divided by second.
Handle zero division exception and print appropriate message.

Params: int a, int b.

Return: int result.
Note: When error occurred return 0. Error message
"Error: Division by zero occurred."
         */

        int a = 10;
        int b = 0;
        int result = divideNums(a, b);
        System.out.println("Result: " + result);
    }

    public static int divideNums(int a, int b) {
        try {
            // Attempt to perform the division
            int result = a / b;
            return result;
        } catch (ArithmeticException e) {
            // Handle the zero division exception
            System.err.println("Error: Division by zero occurred.");
            return 0;
        }
    }


}

