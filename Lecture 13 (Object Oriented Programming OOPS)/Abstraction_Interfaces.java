//Uses of Interfaces 
// 1. Multiple Inheritance
// 2. Total Abstraction (100%)

public class Abstraction_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Omnivore omnivore = new Omnivore();

        // Call methods from each interface
        omnivore.eatsHerbivoreFood();
        omnivore.eatsCarnivoreFood();

        // Call the specific method of Omnivore
        omnivore.eatsBoth();
    }
}

interface ChessPlayer {
    void moves(); // abstract and public both automatically
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Right, Left, Diagonal (in all four direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Right, Left");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Right, Left, Diagonal (for 1 steps)");
    }
}

// Multiple Inheritance Example
interface Herbivore {
    void eatsHerbivoreFood(); // Specific to Herbivore
}

interface Carnivore {
    void eatsCarnivoreFood(); // Specific to Carnivore
}

// Omnivore implements both interfaces
class Omnivore implements Herbivore, Carnivore {

    public void eatsHerbivoreFood() {
        System.out.println("Eats plants.");
    }

    public void eatsCarnivoreFood() {
        System.out.println("Eats meat.");
    }

    public void eatsBoth() {
        System.out.println("Eats both plants and meat.");
    }
}

