package EXCEPTION;

public class PracticeTryCatch {
    public static void main(String[] args) {
        method1();
        System.out.println("Hello");
    }

    public static void method1() {
        try {
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error. Deviding by zero");
        }
    }
}