// "Is a" Relationship (Inheritance):
class Animal {
    makeSound() {
        console.log("Animal makes a sound");
    }
}

class Dog extends Animal {
    bark() {
        console.log("Dog barks");
    }
}

// Example usage
const myDog = new Dog();
myDog.makeSound(); // Inherited from Animal
myDog.bark();      // Specific to Dog

// "Has a" Relationship (Composition):
class Engine {
    start() {
        console.log("Engine starts");
    }
}

class Car {
    constructor() {
        this.carEngine = new Engine(); // Car has an Engine
    }

    startCar() {
        this.carEngine.start(); // Delegating the start functionality to Engine
        console.log("Car starts");
    }
}

// Example usage
const myCar = new Car();
myCar.startCar();

//"Uses a" Relationship (Association):
class Printer {
    print(text) {
        console.log("Printing: " + text);
    }
}

class User {
    usePrinter(printer) {
        printer.print("Hello, world!"); // User uses a Printer
    }
}

// Example usage
const myPrinter = new Printer();
const user = new User();
user.usePrinter(myPrinter);
