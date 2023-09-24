package sub_scenario_2;
import java.util.ArrayList;
import java.util.List;

// Define the Manager class, which extends Admin
public class Manager extends Admin {

    // Declare class-level attributes
    private List<Instructor> instructorList;
    private List<String> complaintsList;
    private List<String> questionsList;
    private Database database;
    private Queries queries;
    
    // Constructor for the Manager class
    public Manager(String name, String address, String email, Integer phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password); // Call the constructor of the parent class (Admin)

        // Initialize the database and Queries attribute
        this.database = new Database();
        this.queries = new Queries();
        
        // Initialize the instructorList as an ArrayList
        instructorList = new ArrayList<Instructor>();
    }

    // Method to access instructors
    public List<Instructor> accessInstructor() {
        // Call the displayInstructors method on the database instance
        instructorList = database.displayInstructors();

        // Return the list of instructors
        return instructorList;
    }

    // Method to access complaints
    public List<String> accessComplaints() {
        // Return a list of complaints by calling the getComplaints method on the queries object
        complaintsList = database.getComplaints();
        return complaintsList;
    }

    // Method to access general questions
    public List<String> accessQuestions() {
        // Return a list of complaints by calling the getComplaints method on the queries object
        questionsList = database.getQuestions();
        return questionsList;
    }
}
