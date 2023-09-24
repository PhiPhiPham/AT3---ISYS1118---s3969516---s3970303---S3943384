package sub_scenario_2;

public class Queries {
    private String questions;
    private String complaints;
    private String reply;

    public Queries() {
        this.questions = "";
        this.complaints = "";
        this.reply = "";
    }

    // Getter and setter for questions
    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    // Getter and setter for complaints
    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    // Getter and setter for reply
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    // Method to reply to a query
    public void replyToQuery(String response) {
        this.reply = response;
    }
}