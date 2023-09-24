package sub_scenario_2;
import java.util.List;

public class Queries {

    private List<String> questions; // Declare as a class-level attribute
    private List<String> complaints; // Declare as a class-level attribute
    private List<String> replies; // Declare as a class-level attribute

    // Getter and setter for questions
    public List<String> getQuestions() {
        return questions;
    }

    public void addQuestions(String question) {
        questions.add(question);
    }

    // Getter and setter for complaints
    public List<String> getComplaints() {
        return complaints;
    }

    public void addComplaints(String complaint) {
        complaints.add(complaint);
    }

    // Getter and setter for reply
    public List<String> getReply() {
        return replies;
    }

    public void addReply(String reply) {
        replies.add(reply);
    }

}