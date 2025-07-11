// Multilevel Inheritance: Class inherits from a class that itself inherits from another
// Example: Puppy -> Dog -> Animal
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  // From Animal
        puppy.bark(); // From Dog
        puppy.play(); // From Puppy
    }
}