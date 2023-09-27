package codespace;

public abstract class Admin extends User {

    // Constructor for Admin
    public Admin(String name, String address, String email, Integer phoneNo, String username, String password) {
        super(name, address, email, phoneNo, username, password);
    }

    //send auto emails for admin
    public String sendAutoEmail(String email) {
        return email;
    }

}
