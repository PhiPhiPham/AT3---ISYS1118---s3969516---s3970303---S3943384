package sub_scenario_1;

public class Student extends User  {
    private int emergencyContact;

    // Constructor to create a Student object
    public Student(String name, String address, String email, Integer phoneNo, String username, String password, Integer emergencyContact) {
        super(name, address, email, phoneNo, username, password);
        this.emergencyContact = emergencyContact;
    }

    // Setter for the emergency contact 
    public void setEmergencyContact(Integer contact) {
        this.emergencyContact = contact;
    }

    // Getter for emergency contact 
    public Integer getEmergencyContact() {
        return this.emergencyContact;
    }

    // Method to access a Student object
    public static Student accessStudent() {
        // Create and return a new Student object
        return new Student("James", "540 King Street", "Jameson@gmail.com", 000, "James123", "James123",  000); //Replace the actual emergency contact value inside brackets 
    }

}