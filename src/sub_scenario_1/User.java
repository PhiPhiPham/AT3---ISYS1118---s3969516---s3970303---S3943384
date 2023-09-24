package sub_scenario_1;

public abstract class User {
    private String name;
    private String address;
    private String email;
    private int phoneNo;
    private String username;
    private String password;

    public User(String name, String address, String email, int phoneNo, String username, String password) {
        this.name = name;
        this.address = address; 
        this.email = email;
        this.phoneNo = phoneNo;
        this.username = username;
        this.password = password; 
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'address'
    public String getAddress() {
        return address;
    }

    // Setter for 'address'
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for 'email'
    public String getEmail() {
        return email;
    }

    // Setter for 'email'
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for 'phoneNo'
    public int getPhoneNo() {
        return phoneNo;
    }

    // Setter for 'phoneNo'
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Getter for 'username'
    public String getUsername() {
        return username;
    }

    // Setter for 'username'
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for 'password'
    public String getPassword() {
        return password;
    }

    // Setter for 'password'
    public void setPassword(String password) {
        this.password = password;
    }

}
