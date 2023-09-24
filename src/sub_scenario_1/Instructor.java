package sub_scenario_1;
import java.util.List;

public class Instructor extends Admin {
    
    private List<Course> coursesTaught;
    
    public Instructor(String name, String address, String email, int phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
    }

    public boolean accessInstructor() {
        return true;
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
    }

    public void displayCoursesTaught() {
        System.out.print(coursesTaught);
    }

}
