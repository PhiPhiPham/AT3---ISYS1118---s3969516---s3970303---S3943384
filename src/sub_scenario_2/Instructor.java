package sub_scenario_2;
import java.util.List;

// Define the Instructor class, which extends Admin
public class Instructor extends Admin {

    // Declare a Database attribute to access instructor data
    private Database database; 
    
    // Constructor for the Instructor class
    public Instructor(String name, String address, String email, int phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password); // Call the constructor of the parent class (Admin)
    }

    // Method to access instructor-related information
    public List<Instructor> accessInstructor() {
        // Return a list of instructors by calling the displayInstructors method on the database object
        return database.displayInstructors();
    }
}
