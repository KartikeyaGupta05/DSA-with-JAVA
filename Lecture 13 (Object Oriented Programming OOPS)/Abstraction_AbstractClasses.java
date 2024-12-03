public class Abstraction_AbstractClasses {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal {

    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void setColor(){
        color = "Dark Brown";
    }
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
    
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Chicken constructor is called");
    }
    void setColor(){
        color = "White";
    }
    void walk() {
        System.out.println("Walks on two legs");
    }
}