package codespace;
import java.util.ArrayList;
import java.util.List;

public class Payment {
    private int amount;
    private boolean payment;
    private String paymentOption;
    private List<Instructor> paidInstructors; 
    private List<Instructor> paidStudents; 

    public Payment(int amount, boolean payment, String paymentOption){
        this.amount = amount;
        this.payment = payment;
        this.paymentOption = paymentOption;
    }

    // Getter for 'amount'
    public int getAmount() {
        return amount;
    }

    // Setter for 'amount'
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Getter for 'payment'
    public boolean isPayment() {
        return payment;
    }

    // Setter for 'payment'
    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    // Getter for 'paymentOption'
    public String getPaymentOption() {
        return paymentOption;
    }

    // Setter for 'paymentOption'
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    
    // Instructor paying to add a course. If already paid, additional courses will not incur a fee. 
    public boolean payItem() {
        if (payment == false) {
            System.out.print("Registration has not been paid for and will now charge $" + amount + ", thank you.\n"); 
            this.payment = true;
        }
        else {
            System.out.print("Registration has already been paid for, thank you.\n");
        }
        
        return this.payment;
    }


}
