package sub_scenario_2;

public class Manager extends Admin{
    
public Manager(String name, String address, String email, Integer phoneNo, String username, String password) {
    super(name, address, email, phoneNo, username, password);
    private List<Instructor> instructorList;
}

public void accessInstructor() {
    instructorList = Database.displayInstructors();
}

public Boolean accessComplaints() {
    return true;
}

}
