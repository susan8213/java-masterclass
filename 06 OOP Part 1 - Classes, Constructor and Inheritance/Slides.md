# Slides: 06. OOP Part 1 - Classes, Constructors and Inheritance


## Reference vs Object vs Instance vs Class

Let's use the analogy of building a house to understand Classes.
A **class** is basixally a blueprint for a house, using the blueprint we can build many houses as we like based on those plans.
Each house you buld (in other words **instantiate** using the **new** operator) is an **object** also known as an **instance**.
Each house you buld has an address. In other words if you want to tell someone where you live, you give them your address. This is known as a **reference**. You can copy that **reference** as many times as you like but there is still just one house. In other words we are copying the paper that has address on it not the house itself.
We can pass **referencess** as **parameters** to **constructors** and **methods**.

## this vs super

**super** is used to access/call the parent class members (variables and methods). **super** is commonly used with **method overriding**, when we call a method with the same name from the parent class.
**this** is used to call the current class members (variables and methods). This is required when we have a parameter with the same name as an instance variable (filed). **this** is commonly used with **constructors** and **setters**, and optionally in getters.

In Java we have **this()** call and the **super()** call. **this()** to call a constructor from another overloaded constructor in the same class, and only can be used only in a constructor, and it must be the first statement in a constructor. **super()** to call a parent constructor, and must be the first statement in each constructor, even parent is Abstract classes.

NOTE: We can use both of them anywhere in a class except static areas (static block or a a static method). Any attempt to do so will lead to compile-time errors.

## Method Overriding vs Overloading

Method **overloading** means providing two or more separate methods in a class with the **smae name** but **different parameters**, that allows us to **reuse** the same method name, it reduces duplicated code and we don;t have to remember multiple method names.
**Overloading** does not have anything to do with **polymorphism** but Java developers often refer to overloading as Compile Time Polymorphism. In other words the compiler decided which method is going to be called based on the method name, return type and argument list. We **can overload static** and **instance** method.

### Method Overloading Rules
- Methods must have the same method name.
- Methods must have different parameters.
- Have different return types.
- Have different access modifiers.
- Throw different checked or unchecked exceptions.

Method **overriding** means defining a method in a child class that already exists in the parent class with same signature (same name, same arguments). By extending the parent class the child class gets all the methods defined in the parent class (also known as derived methods).
Method **overriding** is also known as **Runtime Polymorphism** and **Dynamic Method Dispatch**, because the method that is going to be called is decided at runtime by the JVM. We **can't override static** methods **only instance** methods.

### Method Overriding Rules
- It must have same name and same arguments.
- Return type can be a subclass of the return type in the parent class.
- It can't have a lower access modifier. For example if the parent method is protected then using private in the child is not allowed but using public in the child would be allowed
- **Only inherited methods can be overridden**, in other words methods can be overridden only in child classes.
- **Constructors and private methods cannot be overridden**.
- Methods that are final cannot be overridden.
- A subclass can use **supermethodName()** to call the superclass version of an overridden method.

### Comparison

|Method Overloading|Method Overriding|
|---|---|
|Provides functionality to reuse a method name with different parameters.|Used to override a behavior which th class has inherited from the parent class.|
|Usually in a single class but may also be used in a child class.|**Always in two classes** that have a child-parent or IS-A relationship.|
|**Must have** different parameters.| **Must have** the same oarameters and same name.|
|May have different return types.| Must have the same return type or covariant return type (child class).|
|May have different access modifiers(private, protected, public).|**Must NOT** have a lower modifer but may have a higher modifier.|
|May throw different exceptions.|**Must NOT** throw a new or broader checked exception.|

## Static vs Instance Methods

**Static methods** are declared using a **static** modifier. **Static methods can't** access instance methods and instance variables directly. They are usually used for operations that don't require any data from an instance of the class (from 'this'), so we can't use the **this** keyword in **static methods**.

**Instance methods** belong to an instance of a class. To use an **instance method** we have to instantiate the class first usually by using the **new** keyword. **Instance methods** can access instance methods , instance variables, and also static methods, static variables directly.

## Static vs Instance Variables

Every instance of that class **shares** the same **static variables**, they are also know as **static member variables**. If changes are made to that variable, all other instances will see the effect of the change. 

```
class Dog {
    private static String name;
    
    public Dog(String name) {
        Dog.name = name;
    }
    
    public void printName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog(fluffy");
        rex.printName();      // print fluffy
        fluffy.printName();   // print fluffy
    }
}
```

**Instance variables** belong to an instance of a class, they are also know as fields or member variables. Every instance has it's own copy of an instance variable, every instance can have a different value (state).

```
class Dog {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public void printName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog(fluffy");
        rex.printName();      // print rex
        fluffy.printName();   // print fluffy
    }
}
```