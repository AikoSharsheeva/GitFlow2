package EXCEPTION;
class Calculator {
    public int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int dividend = 10;
        int divisor = 0;

        try {
            int result = calculator.divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

