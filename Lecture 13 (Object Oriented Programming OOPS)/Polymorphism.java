public class Polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)2.5));
        // System.out.println(calc.sum(1, 2, 3));
        Animal a = new Deer();
        a.eat();  // output - Eats Grass
        Animal b = new Animal();
        b.eat();  // Output - Eats Anything
        // Deer deer = new Deer(); 
        // deer.eat();
    }
}

// Method / Function Overloading - Compile Time Polymorphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}


// Method / Function Overriding - Run Time Polymorphism
class Animal {
    String color;

    void eat() {
        System.out.println("Eats anything");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Deer extends Animal{
    int legs;
    void run(){
    System.out.println("Runs");
    }
    void eat(){
    System.out.println("Eats Grass");
    }
}