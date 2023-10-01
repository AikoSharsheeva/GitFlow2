package Sezi.week13;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;



    }

    public void displayDetails(){

        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);

    }
}

class EBook extends Book{
    String format;

    public EBook(String title, String author, double price, String formats) {
        super(title, author, price);
        this.format = formats;
    }


    @Override
    public void displayDetails(){
        if (format.equalsIgnoreCase("PDF") || format.equalsIgnoreCase("ePub")){
            System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "Format: " + format);
        }
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }



}

class Main{
    public static void main(String[] args) {
        // Test Book class
        System.out.println("Testing Book class:");


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);


        EBook ebook1 = new EBook("Pride and Prejudice", "Jane Austen", 9.99, "PDF");


        System.out.println("Details of the Book:");
        book1.displayDetails();

        System.out.println("\nDetails of the EBook:");
        ebook1.displayDetails();

    }
}
