package codespace;

// Define the abstract User class
public abstract class User {
    // Declare private attributes for user information
    private String name;
    private String address;
    private String email;
    private Integer phoneNo;
    private String username;
    private String password;

    // Constructor to initialize user information
    public User(String name, String address, String email, Integer phoneNo, String username, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.username = username;
        this.password = password;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter methods for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for 'phoneNo'
    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Getter and setter methods for 'username'
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter methods for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}