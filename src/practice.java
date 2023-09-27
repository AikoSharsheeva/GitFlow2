import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        Person1 ob=new Person1("Ellon", 52, 10000);
        ob.addProjects("Tesla");
        System.out.println("ob.getProjects() = " + ob.getProjects());
        ob.addProjects("spaceX");
        System.out.println("ob.getProjects() = " + ob.getProjects());
        ob.addProjects("Twitter");
        System.out.println("ob.getProjects() = " + ob.getProjects());
        System.out.println("ob.getName() = " + ob.getName());
        System.out.println("ob.getSalary() = " + ob.getSalary());

    }
}
class Person1{
    private String name;
    private int age;
    private double salary;
    List<String>projects=new ArrayList<>();

    public Person1(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public void setName(int age){
        this.name=name;
    }
    public int setAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

public Person1(String name, int age, double salary, List<String> projects){
        this(name, age, salary);
        this.projects=projects;
}
public List<String> getProjects(){
        return projects;
}
public void addProjects(String projectsName){
        projects.add(projectsName);
}




}