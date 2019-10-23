package academy.learnprogramming;

class HealthyBurger extends Hamburger {
    private String addition5Name;
    private double addition5Price;
    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHamburgerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHamburgerAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {

        double hamburgerPrice = super.itemizeHamburger();
        if(this.addition5Name != null) {
            hamburgerPrice += this.addition5Price;
            System.out.println("Added " + this.addition5Name + " for an extra price " + this.addition5Price);
        }
        if(this.addition6Name != null) {
            hamburgerPrice += this.addition6Price;
            System.out.println("Added " + this.addition6Name + " for an extra price " + this.addition6Price);
        }

        return hamburgerPrice;
    }

}

