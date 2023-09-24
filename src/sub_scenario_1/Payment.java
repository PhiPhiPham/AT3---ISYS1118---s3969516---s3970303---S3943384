package sub_scenario_1;

public class Payment {
    private int amount;
    private boolean payment;
    private String paymentOption;

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

}
