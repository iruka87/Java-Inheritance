// Multiple Inheritance (via interfaces): Class implements multiple interfaces
// Example: Bird implements Flyable and Singable
interface Flyable {
    void fly();
}

interface Singable {
    void sing();
}

class Bird implements Flyable, Singable {
    public void fly() {
        System.out.println("The bird flies.");
    }
    
    public void sing() {
        System.out.println("The bird sings.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();  // From Flyable
        bird.sing(); // From Singable
    }
}