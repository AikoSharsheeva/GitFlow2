package Sezi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student2 {
        private static List<String> studentList = new ArrayList<>();
        private Map<String, Integer> marks;
        private final String yearOfBirth;
        public Student2(String yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            this.marks = new HashMap<>();
        }
        public static List getStudentList() {
            return studentList;
        }
        public Map getMarks() {

            return marks;
        }
        public String getYearOfBirth() {
            return yearOfBirth;
        }
        public void addStudent(String name) {
            studentList.add(name);
        }
        public void addMarks(String subject, int marks) {
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");

            } else {
                this.marks.put(subject, marks);
            }


        }


    public static void main(String[] args) {

// Creating an instance of the Students class

        Student2 students = new Student2("2000");

// Adding students

        students.addStudent("Alice");

        students.addStudent("Bob");

// Adding marks for subjects

        students.addMarks("Math", 90);

        students.addMarks("Science", 85);

        students.addMarks("English", 92);

// Retrieving student list

        List<String> studentList = Student2.getStudentList();

        System.out.println("Student List: " + studentList);

// Retrieving marks

        Map<String, Integer> marks = students.getMarks();

        System.out.println("Marks: " + marks);

// Retrieving year of birth

        String yearOfBirth = students.getYearOfBirth();

        System.out.println("Year of Birth: " + yearOfBirth);

    }
    }
