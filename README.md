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


В Java, существуют различные **типы переменных (static, instance, final, local)** и методов (static, instance), и у них есть разные характеристики и способы создания:

1. **Static (статические) переменные**:
   - Они принадлежат классу, а не экземпляру объекта. Это означает, что они общие для всех экземпляров данного класса.
   - Объявляются с использованием ключевого слова `static`.
   - Обычно инициализируются в блоке статической инициализации или в статическом методе класса.
   - Могут быть доступны без создания экземпляра класса.

Пример:
```java
public class MyClass {
    static int staticVariable = 10;
    // ...
}
```

2. **Instance (переменные экземпляра) переменные**:
   - Они принадлежат конкретному экземпляру класса и у каждого объекта класса могут быть свои значения для таких переменных.
   - Объявляются внутри класса, но не с использованием `static`.
   - Их значения устанавливаются при создании объекта.

Пример:
```java
public class MyClass {
    int instanceVariable = 20;
    // ...
}
```

3. **Final (константные) переменные**:
   - Они объявляются с использованием ключевого слова `final` и не могут быть изменены после инициализации.
   - Final переменные могут быть как статическими, так и переменными экземпляра.
   - Их значения должны быть установлены при объявлении или в конструкторе (для переменных экземпляра).

Пример:
```java
public class MyClass {
    final int constantInstanceVariable = 30;
    static final int CONSTANT_STATIC_VARIABLE = 40;
    // ...
}
```

4. **Instance (методы экземпляра) методы**:
   - Эти методы привязаны к экземпляру класса и могут обращаться к переменным экземпляра.
   - Вызываются через экземпляр объекта.

Пример:
```java
public class MyClass {
    public void instanceMethod() {
        // ...
    }
}
```

5. **Static (статические) методы**:
   - Они не привязаны к экземпляру класса и могут обращаться только к статическим переменным и методам.
   - Вызываются через имя класса, а не через экземпляр объекта.

Пример:
```java
public class MyClass {
    public static void staticMethod() {
        // ...
    }
}
```


В Java, метод, который привязан к экземпляру класса, называется "методом экземпляра" или "неметодом объекта". Этот метод оперирует данными, принадлежащими конкретному объекту данного класса и может изменять состояние этого объекта. Чтобы понять и использовать методы экземпляра, вам нужно выполнить следующие шаги:

1. **Создание объекта класса**: Прежде чем вызвать метод экземпляра, вам нужно создать объект (инстанс) класса. Вы можете сделать это с помощью оператора `new`.

   Пример:
   ```java
   MyClass myObject = new MyClass(); // Создание экземпляра класса
   ```

2. **Вызов метода экземпляра**: После создания объекта, вы можете вызвать его методы, используя имя объекта, оператор точки (`.`), и имя метода.

   Пример:
   ```java
   myObject.instanceMethod(); // Вызов метода экземпляра
   ```

3. **Передача аргументов**: Методы экземпляра могут принимать аргументы (параметры), которые передаются внутрь метода при его вызове. Аргументы служат для передачи информации методу.

   Пример:
   ```java
   public void displayMessage(String message) {
       System.out.println(message);
   }

   // Вызов метода с передачей аргумента
   myObject.displayMessage("Привет, мир!");
   ```

4. **Изменение состояния объекта**: Методы экземпляра могут изменять состояние объекта, к которому они привязаны, путем изменения значений его переменных (полей).

   Пример:
   ```java
   public void setName(String name) {
       this.name = name; // "this" используется для обращения к полю экземпляра класса
   }

   // Вызов метода для изменения имени объекта
   myObject.setName("John");
   ```

5. **Доступ к переменным экземпляра**: Методы экземпляра могут обращаться к переменным экземпляра (полям) объекта, используя ключевое слово `this`.

   Пример:
   ```java
   public void displayInfo() {
       System.out.println("Имя: " + this.name);
   }

   // Вызов метода для вывода информации об объекте
   myObject.displayInfo();
   ```

## Final 
Переменные, объявленные с ключевым словом `final` в Java, называются "константами" и имеют следующие особенности и правила работы:

1. **Неизменяемость**: После инициализации переменной как `final`, её значение не может быть изменено. Она становится неизменяемой.

2. **Обязательная инициализация**: Переменные `final` должны быть инициализированы до того, как к ним можно будет обратиться. Если переменная объявлена внутри метода, она должна быть инициализирована до завершения конструктора этого метода. Если переменная объявлена вне метода (как поле класса), она должна быть инициализирована либо при объявлении, либо в конструкторе.

3. **Именование в верхнем регистре**: По соглашению, имена константных переменных принято писать заглавными буквами и использовать подчёркивание для разделения слов. Например, `final int MAX_VALUE = 100;`.

4. **Использование в статическом контексте**: Переменные `final` могут быть как статическими (принадлежащими классу) так и нестатическими (принадлежащими экземпляру класса).

Примеры:

```java
public class Example {
    final int a = 10; // Константная переменная экземпляра
    static final int b = 20; // Константная статическая переменная

    public void doSomething() {
        final int c; // Константная переменная, но её можно инициализировать позже
        c = 30;
    }

    public static void main(String[] args) {
        final int d = 40; // Локальная константная переменная

        System.out.println(Example.b); // Можно обращаться к статической константе через класс
        Example obj = new Example();
        System.out.println(obj.a); // Можно обращаться к экземплярной константе через объект
        System.out.println(d); // Локальная константа
    }
}
```
