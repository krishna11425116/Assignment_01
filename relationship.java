// "IS-A" relationship-----> INHERITANCE
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Inherited from Animal
        myDog.bark();      // Specific to Dog
    }
}

// "HAS-A" relationship-----> COMPOSITION
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine carEngine = new Engine(); // Car has an Engine

    void startCar() {
        carEngine.start(); // Delegating the start functionality to Engine
        System.out.println("Car starts");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
// "USES-A" relationship---> ASSOCIATION
class Printer {
    void print(String text) {
        System.out.println("Printing: " + text);
    }
}

class User {
    void usePrinter(Printer printer) {
        printer.print("Hello, world!"); // User uses a Printer
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        User user = new User();
        user.usePrinter(myPrinter);
    }
}
