package academy.learnprogramming;

/*
    Object have tow characteristics: states (fields) and behaviors (methods)
    Object oriented Programming
 */

public class Main {

    public static void main(String[] args) {
        // Create Object with initialization
        // Car porsche;  // Error: no initialization will crash when calling class method.
        Car porsche = new Car();
        Car holden = new Car();

        // Setters and Getters
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
