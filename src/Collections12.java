import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;

public class Collections12 {
    public static void main(String[] args) {
        Person people=new Person("Elon", 52, "IT");
        System.out.println("people.getName() = " + people.getName());

        people.addCompanies("SpaceX");
        System.out.println("people.getCompanies() = " + people.getCompanies());
        people.addCompanies("Twitter");
        people.addCompanies("Tesla");
        System.out.println("people.getCompanies() = " + people.getCompanies());


    }
}
class Person{
    private String name;
    private int age;
    private String departament;
    private List<String>companies=new ArrayList<>();

    public Person(String name, int age, String departament) {
        this.name = name;
        this.age = age;
        this.departament = departament;
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

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Person(String name, int age, String departament, List<String> companies){
        this(name, age, departament);
        this.companies=companies;
    }
    public List<String> getCompanies(){
        return companies;
    }
    public void addCompanies(String companiesName){
        companies.add(companiesName);
    }





}
