package EXCEPTION;

public class MultipleCatch {


    public static void main(String[] args) {
        Object obj1 = new Integer(10);
        Object obj2 = null;
        Object obj3 = "Hello";

        performObjectOperations(obj1);
        performObjectOperations(obj2);
        performObjectOperations(obj3);
    }

    public static void performObjectOperations(Object obj) {
        try {
            // Попытка разделить целое число на ноль
            int result = (Integer) obj / 0;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // ArithmeticException
            System.err.println("Error: ArithmeticException - Division by zero.");
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.err.println("Error: NullPointerException - Object is null.");
        } catch (ClassCastException e) {
            // Handle ClassCastException
            System.err.println("Error: ClassCastException - Invalid type casting.");
        }
    }
}
