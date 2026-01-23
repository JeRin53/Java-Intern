
abstract class Animal {
    abstract void makeSound();
}


class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Dog says: Bark!"); }
}

class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Cat says: Meow!"); }
}

class Cow extends Animal {
    @Override
    void makeSound() { System.out.println("Cow says: Moo!"); }
}


public class PolymorphismApp {
    public static void main(String[] args) {
        // We store everything in an Animal array (Upcasting)
        Animal[] farm = { new Dog(), new Cat(), new Cow() };

        System.out.println("--- Animal Sound App 2026 ---");
        
     
        for (Animal a : farm) {
            a.makeSound(); 
        }
    }
}

