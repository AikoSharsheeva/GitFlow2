package Project1_1;

import java.util.ArrayList;
import java.util.List;

public class BasicProjectBank {


        public static void main(String[] args) {
            Address c1address = new Address("123 Main", "Patterson", 0001, "USA");
            Address c2address = new Address("444 Central Park ave", "Chicago", 60602, "USA");
            Address c3address = new Address("Beverly Hills", "LA", 90990, "USA");
//Create banking account for john doe
            Account johnDoeChecking=new Account("12345678", 245644);
            Account johnDoeSavings=new Account("454433", 984565);
//Store all  john doe accounts on a list
            List<Account>johnDoeAccounts=new ArrayList<>();

            johnDoeAccounts.add(johnDoeChecking);
            johnDoeAccounts.add(johnDoeSavings);

            //Ellon Musk
            Account ellonChecking=new Account("11111", 545454);
            Account ellonSavings=new Account("2222", 787878);

            List<Account>ellonAccounts=new ArrayList<>();
            ellonAccounts.add(ellonChecking);
            ellonAccounts.add(ellonSavings);

            //Jessica
            Account jessicaChecking=new Account("8888888", 33333);
            Account jessicaSavings=new Account("77777", 7777777);

            List<Account>jessicaAccounts=new ArrayList<>();
            jessicaAccounts.add(jessicaChecking);
            jessicaAccounts.add(jessicaSavings);

            Customer c1 = new Customer("John Doe", c1address, johnDoeAccounts);
            Customer c2 = new Customer("Elon Musk", c2address,ellonAccounts);
            Customer c3 = new Customer("Jessica Alba", c3address, jessicaAccounts);

            List<Customer> customerList = new ArrayList<>();
            customerList.add(c1);
            customerList.add(c2);
            customerList.add(c3);

            Bank chaseBank = new Bank("Chase", customerList);
            System.out.println(chaseBank.getName());
// Получение списка клиентов банка
            List<Customer> cList = chaseBank.getCustomerList();
            // Перебор списка клиентов
            for (Customer obj : cList) {
                // Проверка имени клиента и вывод информации о клиенте
                if (obj.getName().equalsIgnoreCase("Elon Musk"))
                    System.out.println(obj.getName());
                System.out.println(obj.getAdress().getCountry());
                System.out.println(obj.getAdress().getCity());
                System.out.println(obj.getAdress().getStreet());
                System.out.println(obj.getAdress().getZipcode());
            }
            // Вызов метода printAllAccounts для вывода информации о счетах клиентов
            printAllAccounts(chaseBank);

        }
        // create method that will print all accounts of customers
        public static void printAllAccounts(Bank bank){
            List<Customer>customerList=bank.getCustomerList();
            for(Customer custmObj:customerList){
                System.out.println(custmObj.getName());
                List<Account>accountList=custmObj.getAccountsList();
                for(Account accountObj:accountList){
                    System.out.println("Account number "+ accountObj.getAccountNumber());
                    System.out.println("Account balance "+ accountObj.getBalance());
                }
            }

        }


    }

    class Customer {
        private String name;
        private Address address;
        private List<Account>accountsList;

        public Customer(String name, Address address,List<Account>accountsList) {
            this.name = name;
            this.address = address;
            this.accountsList=accountsList;
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

        public List<Account> getAccountsList() {
            return accountsList;
        }

        public void setAccountsList(List<Account> accountsList) {
            this.accountsList = accountsList;
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

    class Account{
    private String accountNumber;
    private double balance;

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;


        }
    }

