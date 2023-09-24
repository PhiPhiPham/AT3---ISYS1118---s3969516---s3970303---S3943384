package sub_scenario_1;
import java.util.ArrayList;
import java.util.List;

public class Instructor extends Admin {
    
    private List<Course> coursesTaught;

    // constructor
    public Instructor(String name, String address, String email, int phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
        this.coursesTaught = new ArrayList<>(); // Initialize the list
    }

    // access Instructor method
    public boolean accessInstructor() {
        return true;
    }

    // add taught course to list
    public void addCourse(Course course) {
        coursesTaught.add(course);
    }

    // display taught courses
    public void displayCoursesTaught() {
        System.out.print(coursesTaught);
    }

}
