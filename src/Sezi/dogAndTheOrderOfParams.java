package Sezi;

public class dogAndTheOrderOfParams {
    /**Description: Implement a class called Dog that represents a dog.
     * The class should have two constructors with the same number of parameters but different data types.
     The class should have two instance variables: name (String) and age (int) to store the name and age of the dog, respectively.
     The first constructor should take a String parameter representing the name of the dog and an int parameter representing the age of the dog.
     This constructor should initialize the instance variables name and age with the provided values.
     The second constructor should take an int parameter representing the age of the dog and a String parameter representing the name of the dog.
     This constructor should initialize the instance variables name and age with the provided values, but in a different parameter order compared to the first constructor.
     By providing two constructors with the same number of parameters but different data types and parameter orders, the class allows flexibility in creating Dog objects.
     This allows users to initialize the name and age of a dog using different argument orders while maintaining the same number of parameters.
     Example usage:

     Dog dog1 = new Dog("Buddy", 3); // Initializes dog1 with name "Buddy" and age 3

     Dog dog2 = new Dog(5, "Max"); // Initializes dog2 with name "Max" and age 5*/

    class Dog{
        public String name;
        public int age;

        public Dog(String nameDog, int ageDog){
            name = nameDog;
            age = ageDog;

        }

        public Dog(int ageDog, String nameDog){
            age = ageDog;
            name = nameDog;

        }

    }
}
