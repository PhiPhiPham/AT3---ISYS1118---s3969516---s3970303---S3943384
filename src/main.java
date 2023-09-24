import sub_scenario_1.*;
import sub_scenario_2.*;
import sub_scenario_2.Database;
public class main {
    public static void main(String[] args) {
        //sub scenario #1


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
