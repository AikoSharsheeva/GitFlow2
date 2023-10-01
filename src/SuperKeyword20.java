public class SuperKeyword20 {
    public static void main(String[] args) {
        Child obj = new Child();
        Child obj2 = new Child(5, "Hello");
        Child obj3 = new Child("Super");

    }
}

class SuperParent {
    public SuperParent() {
        System.out.println("Default constructor from super class");
    }

    public SuperParent(int a, String b) {
        System.out.println("2 param from Super class");
    }

}

class Child extends SuperParent {

    public Child() {
        System.out.println("Default constructor from Child class");
    }

    public Child(int a, String b) {
        super(a, b);
        System.out.println("2 param from Child class");
    }

    public Child(String b) {
        super(10, b);
        System.out.println("1 param from Child class");
    }

}