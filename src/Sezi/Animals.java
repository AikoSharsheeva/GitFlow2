package Sezi;

import java.util.Scanner;

class Animals {
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        Scanner sc = new Scanner(System.in);
        String sounds = sc.nextLine();
        System.out.printf("%s makes a sound. - %s", name, sounds);
    }
}

class Cat extends Animals {
    public Cat(String name, int age) {
        super(name, age);
    }
}

class Main2 {
    public static void main(String[] args) {
        Animals animal = new Animals("Lion", 5);
        Cat cat = new Cat("Garfield", 3);

        // Creating multiple instances and testing behavior
        Animals animal2 = new Animals("Elephant", -2);
        Animals animal3 = new Animals("Tiger", 4);
        Cat cat2 = new Cat("Tom", 2);

        System.out.println("Animal1:");
        animal.makeSound();
        System.out.println();

        System.out.println("Animal2:");
        animal2.makeSound();
        System.out.println();

        System.out.println("Animal3:");
        animal3.makeSound();
        System.out.println();

        System.out.println("Cat1:");
        cat.makeSound();
        System.out.println();

        System.out.println("Cat2:");
        cat2.makeSound();
    }
}
