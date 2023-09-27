package codespace;
import java.util.List;
import java.util.ArrayList;


public class Database {

    private List<Student> enrolledStudents;
    private List<Instructor> registeredInstructors; 
    private List<Course> registeredCourses; 
    private List<String> courseInfo; 
    private boolean signedIn = false;
    private Queries queries;
    private Course course;

    public Database() {
        enrolledStudents = new ArrayList<Student>();
        registeredInstructors = new ArrayList<Instructor>();
        registeredCourses = new ArrayList<Course>();

        // Initialize the database attribute
        this.queries = new Queries();
    }
    
    // Method to enroll a student
    public void studentEnroll(Student student) {
        enrolledStudents.add(student);
    }

    // Method to display enrolled students
    public List<Student> displayEnrolledStudents() {
        return enrolledStudents;
    }

    // Method to delete a student
    public void deleteStudent(Student student) {
        // Iterate through the enrolledStudents list and remove the student with the given name
        for (Student studentCheck : enrolledStudents) {
            if (studentCheck.equals(student)) {
                enrolledStudents.remove(student);
                break; // Exit the loop after removal
            }
        }
    }

    public boolean loginInstructor(Instructor instructor) {
        if (registeredInstructors.contains(instructor)) {
            signedIn = true;
        }
        else {
            System.out.println("Please create an Instructor account.");
            signedIn = false;
        }
        return signedIn;
    }

    public void createInstructor(String name, String address, String email, int phoneNo, String username, String password) {
        //check if signed in, if signed in break, if not sign up.
        if (signedIn == true) {
            return;
        }
        else {
            Instructor instructor = new Instructor(name, address, email, phoneNo, username, password);
            loginInstructor(instructor);
            registeredInstructors.add(instructor);
        }
    }

    // Method to register an instructor
    public void registerCourse(String title, String courseDescStription, Instructor instructor, String category, Integer fee) {
        if (registeredInstructors.contains(instructor) && signedIn == true){
            Course course = new Course(title, courseDescStription, instructor, category, fee);
            registeredCourses.add(course);
        }
        else {
            System.out.println("Please create an Instructor account or log in to continue.");
        }
    }

    // Method to register an instructor
    public void registerInstructor(Instructor instructor) {
        registeredInstructors.add(instructor);
    }

    // Method to display registered instructors
    public List<Instructor> displayInstructors() {
        return registeredInstructors;
    }

    // Method to delete an instructor
    public void deleteInstructor(Instructor instructor) {
        // Iterate through the registeredInstructors list and remove the instructor with the given name
        for (Instructor instructorCheck : registeredInstructors) {
            if (instructorCheck.equals(instructor)) {
                registeredInstructors.remove(instructor);
                break; // Exit the loop after removal
            }
        }
    }

    // Method to register a course
    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    // Method to display registered courses
    public List<Course> displayCourses() {
        return registeredCourses;
    }

    // Method to delete a course
    public void deleteCourse(Course course) {
        // Iterate through the registeredCourses list and remove the course with the given course code
        for (Course courseCheck : registeredCourses) {
            if (courseCheck.equals(course)) {
                registeredCourses.remove(course);
                break; // Exit the loop after removal
            }
        }
    }

    public List<String> getCourseInformation(){
        courseInfo.add(course.getTitle());
        courseInfo.add(course.getCourseDescription());
        courseInfo.add(course.getCategory());
        return courseInfo;
    }

    // Getter for questions
    public List<String> getQuestions() {
        return queries.getQuestions();
    }
    // Getter for complaints
    public List<String> getComplaints() {
        return queries.getComplaints();
    }
}
