import codespace.*;
public class main {
    public static void main(String[] args) {

        System.out.print("\n\n\n\nWelcome to IT Ed Serves\n\n\n\n");

        // Instantiating a database
        Database database = new Database();

        //sub scenario #1 - NEW Instructor registers a course on the learning portal/website

        //// Main route of registering a new Instructor ////

        // Creating a new instructor account
        Instructor instructor = new Instructor("InstructorName", "InstructorAddress", "InstructorEmail", 123456789, "InstructorUsername", "InstructorPassword");

        // Payment
        Payment payment = new Payment(50, false, "paypal");
        System.out.println();

        // If Instructor paid registration fee they can create a course 
        if (payment.payItem() == true) {
            Course course = new Course("Introduction to Dynamic Programming", "Description of Course", instructor, "Dynamic Programming", 100);
            System.out.println("You have created a new course with the title '" + course.getTitle() + "' Congratulations.");

        // Add Course to database;
        database.registerCourse(course);


        // Add Instructor to database
        database.registerInstructor(instructor);
        }
        else {
            System.out.println("The payment has failed. Please try again or contact the support team for assistance.");
        }        

        System.out.println("Main course of scenario #1 is now complete.\n\n");

        //// Alt Route of adding a course but is an existing instructor ////
        //An assumption has been made that the instructor previously had an account//
        
        Instructor instructor2 = new Instructor("InstructorName", "InstructorAddress", "InstructorEmail", 123456789, "InstructorUsername", "InstructorPassword");

        //for the sake of example we are assuming this instructor had already previously existed.//
        /////////////////////////////////////////////////////////////////////////////

        // Payment is true because instructor had already paid the registration fee.
        Payment payment2 = new Payment(50, true, "paypal");
        System.out.println();

        // If Instructor had previously paid the fee they can create another couse without paying again
        if (payment2.payItem() == true) {
            Course course2 = new Course("Introduction to Dynamic Programming", "Description of Course", instructor2, "Dynamic Programming", 100);
            System.out.println("You have created a new course with the title '" + course2.getTitle() + "' Congratulations.");

        // Add Course to database;
        database.registerCourse(course2);

        // Add Instructor to database
        database.registerInstructor(instructor2);
        }
        else {
            System.out.println("The payment has failed. Please try again or contact the support team for assistance.");
        }       
        System.out.println("Alternate course of scenario #1 is now complete.\n\n");
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

        System.out.println("Scenario #2 is now complete.\n\n");
    }
}
