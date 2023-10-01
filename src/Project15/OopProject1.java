package Project15;

import java.util.ArrayList;
import java.util.List;

public class OopProject1 {
    public static void main(String[] args) {
        Address c1address = new Address("123 Main", "Patterson", 0001, "USA");
        Address c2address = new Address("444 Central Park ave", "Chicago", 60602, "USA");
        Address c3address = new Address("Beverly Hills", "LA", 90990, "USA");

        Customer c1 = new Customer("John Doe", c1address);
        Customer c2 = new Customer("Elon Musk", c2address);
        Customer c3 = new Customer("Jessica Alba", c3address);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        Bank chaseBank = new Bank("Chase", customerList);
        System.out.println(chaseBank.getName());

        List<Customer> cList = chaseBank.getCustomerList();
        for (Customer obj : cList) {
            if (obj.getName().equalsIgnoreCase("Elon Musk"))
                System.out.println(obj.getName());
            System.out.println(obj.getAdress().getCountry());
            System.out.println(obj.getAdress().getCity());
            System.out.println(obj.getAdress().getStreet());
            System.out.println(obj.getAdress().getZipcode());
        }

    }
}

class Customer {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAdress() {

        return address;
    }

    public void setAdress(Address adress) {

        this.address = address;
    }
}


class Address {
    private String street;
    private String city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {

        return street;
    }

    public void setStreet(String street) {

        this.street = street;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public int getZipcode() {

        return zipcode;
    }

    public void setZipcode(int zipcode) {

        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }
}


class Bank {
    private String name;
    private List<Customer> customerList;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<Customer> getCustomerList() {

        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {

        this.customerList = customerList;
    }

    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;

    }
}
