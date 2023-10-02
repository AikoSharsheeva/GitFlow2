package EXCEPTION;

public class CatchCatch {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            System.out.println("Start try");
            String var = null;
            var.toUpperCase();
            Class.forName("abcd");
            System.out.println("done for try!");
        }catch (Exception e){
            System.out.println("Exception parent class Catch");
        }
//        } catch (ClassNotFoundException e) {
//            System.out.println("Catch Class not found");
//        } catch (NullPointerException a) {
//            System.out.println(a);
//        }
    }

}
