// Hierarchical Inheritance: Multiple classes inherit from one parent class
// Example: Cat and Dog inherit from Animal
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

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();  // From Animal
        dog.bark(); // From Dog
        cat.eat();  // From Animal
        cat.meow(); // From Cat
    }
}