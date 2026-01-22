// 1. Class (Blueprint)
class Vehicle { // Parent Class
    String brand;
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// 3. Inheritance
class Car extends Vehicle { // Child Class inherits from Vehicle
    String model;
    // Polymorphism (Overriding)
    @Override
    void start() {
        System.out.println("Car engine starts with a key.");
    }
    void drive() {
        System.out.println("Car is driving.");
    }
}

// 2. Encapsulation & Objects
class CarType {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation (myCar is an instance of Car)
        myCar.brand = "Toyota"; // Inherited property
        myCar.model = "Camry";  // Car's property

        myCar.start(); // Polymorphic call (prints "Car engine starts...")
        myCar.drive(); // Car's method

        System.out.println("My car is a " + myCar.brand);
        System.out.println("My car model is " + myCar.model);
      }
  }
