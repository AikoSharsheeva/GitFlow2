package Sezi;

public class Person {

    // Public Variables
    public String name;
    public int age;
    public double height;
    public double weight;

    // Constructors
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age, String studentId, int gradeLevel) {
        this.name = name;
        this.age = age;
        this.height = 0.0;  // Default value
        this.weight = 0.0;  // Default value
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0.0;  // Default value
        this.weight = 0.0;  // Default value
    }

    public Person() {
        this.name = "N/A";  // Default value
        this.age = 0;       // Default value
        this.height = 0.0;  // Default value
        this.weight = 0.0;  // Default value
    }
}

class Student extends Person {

    // Additional Instance Variables
    public String studentId;
    public int gradeLevel;
    public double GPA;
    public String major;

    // Constructors
    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.studentId = "N/A";  // Default value
        this.gradeLevel = 0;     // Default value
        this.GPA = 0.0;          // Default value
        this.major = "N/A";      // Default value
    }

    public Student(String name, int age, String studentId, int gradeLevel) {
        super(name, age, 0.0, 0.0);  // Default height and weight
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = 0.0;          // Default value
        this.major = "N/A";      // Default value
    }

    public Student(String name, int age) {
        super(name, age, 0.0, 0.0);  // Default height and weight
        this.studentId = "N/A";  // Default value
        this.gradeLevel = 0;     // Default value
        this.GPA = 0.0;          // Default value
        this.major = "N/A";      // Default value
    }

    public Student() {
        super("N/A", 0, 0.0, 0.0);  // Default values for name, age, height, and weight
        this.studentId = "N/A";     // Default value
        this.gradeLevel = 0;        // Default value
        this.GPA = 0.0;             // Default value
        this.major = "N/A";         // Default value
    }
}

