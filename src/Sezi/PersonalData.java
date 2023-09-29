package Sezi;


/**Description: Create a class called "Person" that represents a person.
 * The class should have several private instance variables to store personal information,
 * and a constructor to initialize these variables. Your task is to create getter methods for only half of the private variables,
 * allowing access to the private data while encapsulating the rest.

 Class: Person

 Instance Variables:
 private String name: Represents the name of the person.
 private int age: Represents the age of the person.
 private String email: Represents the email address of the person.
 private String phoneNumber: Represents the phone number of the person.

 Constructor:

 public Person(String name, int age, String email, String phoneNumber):
 Initializes the name, age, email, and phoneNumber variables using the provided values.

 Getter Methods:
 public String getName(): Returns the name of the person.
 public int getAge(): Returns the age of the person.

 Note: There is no need to create getter methods for the email and phoneNumber variables, as they are not required for this exercise.*/
public class PersonalData {
    class Person{
        private String name;
        private int age;
        private String email;
        private  String phoneNumber;

        public Person(String name, int age, String email, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
