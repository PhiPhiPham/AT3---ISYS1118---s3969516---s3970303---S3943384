package sub__scenario_1;

public class Instructor extends Admin {
    
    public Instructor(String name, String address, String email, int phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
    }

    public boolean accessInstructor() {
        return true;
    }

}
