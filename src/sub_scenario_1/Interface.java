package sub_scenario_1;

public class Interface {
    private boolean display;
    private boolean isMobile;
    private boolean isTablet; 
    private boolean isLaptop;

    public Interface() {
        display = false;
        isMobile = false; 
        isTablet = false; 
        isLaptop = false; 
    }

    // Getter for 'display'
    public boolean isDisplay() {
        return display;
    }

    // Setter for 'display'
    public void setDisplay(boolean display) {
        this.display = display;
    }

    // Getter for 'isMobile'
    public boolean isMobile() {
        return isMobile;
    }

    // Setter for 'isMobile'
    public void setMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }

    // Getter for 'isTablet'
    public boolean isTablet() {
        return isTablet;
    }

    // Setter for 'isTablet'
    public void setTablet(boolean isTablet) {
        this.isTablet = isTablet;
    }

    // Getter for 'isLaptop'
    public boolean isLaptop() {
        return isLaptop;
    }

    // Setter for 'isLaptop'
    public void setLaptop(boolean isLaptop) {
        this.isLaptop = isLaptop;
    }
}
