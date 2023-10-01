public class ABSTRACT26 {
    public static void main(String[] args) {
        Animal1 d = new Dog1();
        Animal1 c = new Cat1();
        d.makesound();
        c.makesound();
    }
}

abstract class Animal1 {
    public abstract void makesound();


}

class Dog1 extends Animal1 {
    public void makesound() {
        System.out.println("Woof");
    }
}

class Cat1 extends Animal1 {
    @Override
    public void makesound() {
        System.out.println("Meow");
    }
}