public class Overriding23 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog=new Dog();
        myAnimal.makeSound();
        myDog.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Make some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof, Woof");
    }
}
