package sub__scenario_1;

public class Course {
    private String title; 
    private String courseDescription;
    private String category; 

    public Course(String title, String courseDescStription, String category) {
        this.title = title;
        this.courseDescription = courseDescStription;
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
