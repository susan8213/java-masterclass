package academy.learnprogramming;

/*
    Encapsulation is the mechanism that allows you to restrict access to certain components
    in the objects that you are creating. You're able to protect the members of a class from external access,
    in order to really guard against unauthorized access.
 */

public class Main {

    public static void main(String[] args) {

        // example: change player class those fields directly
        // 1. we don't like to access class field directly, like the 'health' field in this example.
        // 2. anytime that we change a function or something in here, change our 'name' I should say, the field name.
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // example: make our class private, make sure that our class is not accessible, or the fields within the
        // class aren't accessible to any classes that are outside.
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
