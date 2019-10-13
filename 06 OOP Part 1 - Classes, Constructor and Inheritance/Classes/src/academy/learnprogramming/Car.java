package academy.learnprogramming;

public class Car {
    /*
        access modifier: public (unrestricted access to the class),
                         protected (allow classes in this package to access this class),
                         private (other classes cannot access, only internals can use)
     */

    // template fields with private access modifier.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // method: Setter
    // You can set up all the rules th that class, what is valid, what is not valid.
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("prosche") || validModel.equals("holden")) {
            this.model = model;  // "this" means this class's field or method
        } else {
            this.model = "Unknown";
        }
    }

    // method: Getter
    public String getModel() {
        return this.model;
    }
}
