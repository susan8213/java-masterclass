package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds. This should increment the balance field.
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdraw to complete if their are insufficient funds.
        // You will want to create various code in the Main class to confirm your code is working.
        // Add some System.out.println in the two methods above as well.

        // 1. basic
        Account bobsAccount0 = new Account();  // "Account()" called constructor to create the class.
        bobsAccount0.setNumber("12345");
        bobsAccount0.setBalance(0.00);
        bobsAccount0.setCustomerName("Bob Brown");
        bobsAccount0.setCustomerEmailAddress("myemail.bob.com");
        bobsAccount0.setCustomerPhoneNumber("(087) 123-4567");

        // 2. replace setters with constructor initialization setting.
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail.bob.com", "(087) 123-4567");

        // 3. constructor to call other constructor
        Account bobsAccount2 = new Account();

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        // 4. overloading
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        // Challenge
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters won't be needed
        // test and confirm it works.

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getEmailAddress());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
