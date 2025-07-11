// Hybrid Inheritance: Combination of multiple inheritance types
// Example: Parrot inherits from Bird (which implements Flyable) and extends Animal
interface Flyable {
    void fly();
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Bird extends Animal implements Flyable {
    public void fly() {
        System.out.println("The bird flies.");
    }
}

class Parrot extends Bird {
    void speak() {
        System.out.println("The parrot speaks.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.eat();  // From Animal
        parrot.fly();  // From Flyable via Bird
        parrot.speak(); // From Parrot
    }
}