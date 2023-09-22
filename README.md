# OOP

###Week 12 

In Java, this is a keyword that is used to refer to the current instance of a class. 
It can be used in several different contexts:

Reference to Current Object: The most common use of this is to refer to the current instance of the class within instance methods. 
It allows you to access or modify instance variables and call other methods on the current object.


##Constructor
In Java, a constructor is a special type of method that is used to initialize objects of a class. 
Constructors have the same name as the class and do not have a return type, not even void. They are called automatically when an object of the class is created using the `new` keyword. Constructors are primarily used to set the initial state of an object by initializing its instance variables.


There are two main types of constructors in Java:

1. **Default Constructor**: If a class does not explicitly define any constructors, Java provides a default constructor with no parameters. This default constructor initializes the object with default values (e.g., numeric types are initialized to 0, object references are initialized to `null`, etc.).

   Example of a default constructor:
   ```java
   public class MyClass {
       // Default constructor
       public MyClass() {
           // Initialization code here
       }
   }
   ```

2. **Parameterized Constructor**: These constructors accept one or more parameters, allowing you to pass values to initialize the object with specific values.

   Example of a parameterized constructor:
   ```java
   public class Person {
       private String name;
       private int age;
       
       // Parameterized constructor
       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
   }
   ```

You can have multiple constructors in a class, as long as they have different parameter lists (known as constructor overloading). This allows you to create objects in different ways with various sets of initial values.
