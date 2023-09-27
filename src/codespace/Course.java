package codespace;

public class Course {
    private String title; 
    private String courseDescription;
    private String category; 
    private Integer fee; 
    private boolean checkStudentPay = false;

    Student student = new Student("James", "540 King Street", "Jameson@gmail.com", 000, "James123", "James123",  000);

    
    // Constructor to initialize a Course object
    public Course(String title, String courseDescription, Instructor instructor, String category, Integer fee) {
        this.title = title;
        this.courseDescription = courseDescription;
        this.category = category;
        this.fee = fee;
    }

    // Getter for 'title'
    public String getTitle() {
        return title;
    }

    // Method to check if a student has paid for the course
    public boolean checkStudentPay(Student student) {
        if (this.fee == 0 || checkStudentPay == true) {
            student.paymentConfirmation(true);
            return true;
        } else {
            student.paymentConfirmation(false);
            return false;
        }
    }

    // Setter for 'title'
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for 'courseDescription'
    public String getCourseDescription() {
        return courseDescription;
    }

    // Setter for 'courseDescription'
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    // Getter for 'category'
    public String getCategory() {
        return category;
    }

    // Setter for 'category'
    public void setCategory(String category) {
        this.category = category;
    }

    // Method to create multiple choice questions for the course
    public boolean createMultipleChoice() {
        System.out.print("Created Multiple Choices!");
        return true;
    }

    // Method to create an exam for the course
    public boolean createExam() {
        System.out.print("Created Exam!");
        return true;
    }

    // Method to create a project for the course
    public boolean createProject() {
        System.out.print("Created Project!");
        return true;
    }

    // Method to create a video for the course
    public boolean createVideo() {
        System.out.print("Created Video!");
        return true;
    }

    // Method to terminate the course
    public boolean Quit() {
        System.out.print("Course terminated. Sorry to see you go!");
        return true;
    }

    // Method to refund the course
    public boolean Refund() {
        System.out.print("Refunded Course!");
        return true;
    }
}