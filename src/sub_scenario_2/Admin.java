package sub_scenario_2;

public abstract class Admin extends User {

    // Constructor for Admin
    public Admin(String name, String address, String email, Integer phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
    }

    public String sendAutoEmail(String email) {
        return email;
    }

}
