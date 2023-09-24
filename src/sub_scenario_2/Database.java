package sub_scenario_2;
import java.util.List;

public class Database {

    private List<Student> enrolledStudents;
    private List<Instructor> registeredInstructors; 
    private List<Course> registeredCourses; 
    private Queries queries;

    
    // Method to enroll a student
    public void enrollStudent(Student student) {
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

    // Getter for questions
    public List<String> getQuestions() {
        return queries.getQuestions();
    }
    // Getter for complaints
    public List<String> getComplaints() {
        return queries.getComplaints();
    }
}
