package sub_scenario_1;

public abstract class Admin extends User {

    // constructor
    public Admin(String name, String address, String email, int phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
    }
    
    // sending automatic emails method
    public String sendAutoEmail(String email) {
        return email;
    }
}
