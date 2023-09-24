package sub_scenario_1;

public class Course {
    private String title; 
    private String courseDescription;
    private String category; 

    public Course(String title, String courseDescStription, String category) {
        this.title = title;
        this.courseDescription = courseDescStription;
        this.category = category;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for courseDescription
    public String getCourseDescription() {
        return courseDescription;
    }

    // Setter for courseDescription
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean createMultipleChoice() {
        System.out.print("Created Multiple Choices!");
        return true;
    }

    public boolean createExam() {
        System.out.print("Created Exam!");
        return true;
    }

    public boolean Project() {
        System.out.print("Created Project!");
        return true;
    }

    public boolean Refund() {
        System.out.print("Refunded Item!");
        return true;
    }


}
