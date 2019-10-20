package academy.learnprogramming;

public class Dog extends Animal{

    // assign extra states and extra behaviour for the extending class
    // Dog is able to use inherited states (fields) and behaviours (methods).
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {

        // super means to call the constructor that is for the class that we're extending (inheriting) from.
        // create base class
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // override base method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // use move() not super.move() because that means
        // if you override the move function at a later time for dog, it's gonna correctly call that move method.
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    // Try to uncomment the overriding method to see the difference
//    @Override
//    public void move(int speed) {
//        System.out.println("Dog.move() called");
//        moveLegs(speed);
//        super.move(speed);
//    }
}
