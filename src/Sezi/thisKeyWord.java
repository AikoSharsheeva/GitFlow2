package Sezi;

public class thisKeyWord {
    /**Example:

     University uni1 = new University(); // Initializes uni1 with default values

     University uni2 = new University("ABC University"); // Initializes uni2 with name "ABC University" and default values for other variables

     University uni3 = new University("XYZ University", "City Center", 1990); // Initializes uni3 with name "XYZ University", location "City Center", established year 1990, and default student count

     University uni4 = new University("PQR University", "Suburb Area", 2005, 5000); // Initializes uni4 with name "PQR University", location "Suburb Area", established year 2005, and student count 5000*/

    class University {
        public String name;
        public String location;
        public int establishedYear;
        public int studentCount;

        public University() {
            this.name = "Unknown";
            this.location = "Unknown";
        }

        public University(String name) {
            this.name = name;
            this.location = "Unknown";
        }

        public University(String name, String location, int establishedYear) {
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
        }

        public University(String name, String location, int establishedYear, int studentCount) {
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
            this.studentCount = studentCount;
        }
    }


}
