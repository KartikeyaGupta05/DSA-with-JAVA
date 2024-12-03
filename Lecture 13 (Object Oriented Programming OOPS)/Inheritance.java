public class Inheritance {
    public static void main(String[] args) {
        // Animal a = new Fish();  // This true we can make (Parent reference = Child Object)
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

    //     Dog pet = new Dog();
    //     pet.eat();
    //     pet.breathe();
    //     pet.run();
    //     pet.bark();
    }
}

// Single Level Inheritence - 1 Base class and 1 Derived class
// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims");
//     }
// }

// Multi Level Inheritence - 1 Base class and 2 and more Derived class
// Derived class
// class Mammals extends Animal{
// int legs;
// void run(){
// System.out.println("Runs");
// }
// }

// Derived class
// class Dog extends Mammals{
// void bark(){
// System.out.println("Barks");
// }
// }

// Hierarchial Inheritence - 1 Base class and Derived classes
// Example - Animals - Fish, Mammals, Birds
class Mammals extends Animal {
    void run() {
        System.out.println("Runs");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}
class Bird extends Animal {
    void Fly() {
        System.out.println("Fly");
    }
}