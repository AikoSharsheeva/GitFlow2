package Sezi;

/**Description: Create a class called Guest that represents a hotel guest.
 * The class should have several static and non-static variables, including two final variables,
 * as well as instance and static methods. Implement a full-parameter constructor to initialize the guest object.

 Class: Guest
 Static Variables:

 totalGuests (int): Represents the total count of guests. Increment on each creation.
 hotelName (String): Represents the name of the hotel.

 Instance Variables:

 guestId (int): Represents the unique ID of the guest.
 guestName (String): Represents the name of the guest.
 age (int): Represents the age of the guest.
 isRegular (boolean): Indicates whether the guest is a regular customer or not.

 Final Variables:

 MAX_AGE (int): Represents the maximum age limit for a guest. Set to 100.
 MAX_GUESTS (int): Represents the maximum number of guests allowed in the hotel. Set to 100.
 Static Methods:

 getHotelName(): Returns the name of the hotel.
 setHotelName(String name): Sets the name of the hotel.

 Instance Methods:

 Guest(int guestId, String guestName, int age, boolean isRegular): Initializes the guest object with the provided guest ID, name, age, and regular status.
 displayGuestDetails(): Displays the details of the guest, including the guest ID, name, age, and regular status.

 Example:

 Guest.setHotelName("ABC Hotel");

 Guest guest1 = new Guest(1, "John Doe", 30, true);

 guest1.displayGuestDetails();

 Guest guest2 = new Guest(2, "Jane Smith", 25, false);

 guest2.displayGuestDetails();

 System.out.println("Total Guests: " + Guest.totalGuests);

 System.out.println("Hotel Name: " + Guest.getHotelName());

 Output:

 Guest Details:

 Guest ID: 1

 Name: John Doe

 Age: 30

 Regular: true

 Guest Details:

 Guest ID: 2

 Name: Jane Smith

 Age: 25

 Regular: false

 Total Guests: 2

 Hotel Name: ABC Hotel*/
public class Final {
    static int totalGuests;
    static String hotelName;

    int guestId;
    String guestName;
    int age;
    boolean isRegular;

    final int MAX_AGE = 100;
    final int MAX_GUESTS = 100;

    public Final(int guestId, String guestName, int age, boolean isRegular) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.age = age;
        this.isRegular = isRegular;
    }

    static String getHotelName(){
        return hotelName;
    }

    static void setHotelName(String name){
        hotelName = name;
    }

    public void Guest(int guestId, String guestName, int age, boolean isRegular){

        Final.setHotelName("ABC Hotel");

        Final guest1 = new Final(1, "John Doe", 30, true);
        guest1.displayGuestDetails();


        Final guest2 = new Final(2, "Jane Smith", 25, false);

        guest2.displayGuestDetails();

    }

    public void displayGuestDetails(){
        System.out.println("Total Guests: " + Final.totalGuests);

        System.out.println("Hotel Name: " + Final.getHotelName());

    }




}
