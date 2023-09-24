import sub_scenario_1.*;
import sub_scenario_2.*;
import sub_scenario_2.Database;
public class main {
    public static void main(String[] args) {
        // Instantiating a database
        sub_scenario_1.Database database = new sub_scenario_1.Database();

        //sub scenario #1 - Instructor registers a course on the learning portal/website

        //// Main route of registering a new Instructor ////
        // User wants to add register by adding a course 
        sub_scenario_1.Course course1 = new sub_scenario_1.Course("Introduction to Dynamic Programming", "Description of Course", "Dynamic Programming");
        
        // Payment
        Payment payment1 = new Payment(50, false, "paypal");

        // Checking if payment is paid and pay item
        payment1.payItem();

        // Creating a new account
        sub_scenario_1.Instructor instructor = new sub_scenario_1.Instructor("InstructorName", "InstructorAddress", "InstructorEmail", 123456789, "InstructorUsername", "InstructorPassword");

        // Add Instructor to database
        database.registerInstructor(instructor);

        // Add Course to Instructor
        instructor.addCourse(course1);

        // Add Course to database;
        database.registerCourse(course1);


        // Alt Route of adding a course but is an existing instructor

        // User wants to add register by adding a course
        sub_scenario_1.Course course2 = new sub_scenario_1.Course("Introduction to Algorithms", "Description of Course", "Algorithms");

        // Checking if payment is paid and pay item
        payment1.payItem();

        // Item has already been paid so just add course2
        instructor.addCourse(course2);

        // Add Course to database;
        database.registerCourse(course2);



        //sub scenario #2 - Lodge a general enquiry about the portal which is successfully addressed by the Manager

        // Initialize a new Manager instance
        Manager manager = new Manager("ManagerName", "ManagerAddress", "ManagerEmail", 123456789, "ManagerUsername", "ManagerPassword");

        // Initialize a new Queries instance
        Queries queries = new Queries();

        // Add a question to the queries
        queries.addQuestions("How do I use this portal?");
        queries.addQuestions("How do I sign up to this course?");

        //Manager addresses query
        System.out.println(queries.getQuestions());
    }
}
