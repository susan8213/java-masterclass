package academy.learnprogramming;

public class Player {

    // example: change player class those fields directly
    public String fullName;  // change 'name' to 'fullName'
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
