public class InterFaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Animal Human = new Animal();
        Human.eat();
        Human.walk();
    }
}
// Total Abstraction
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Moves top, down, right, left - (4 dir)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Moves top, down, right, left");
    }
}
class Elephante implements chessPlayer{
    public void moves(){
        System.out.println("Diagonal");
    }
}

// Multiple Inheritance
interface Herbivores{
    void eat();
}

interface Carnivores{
    void walk();
}

class Animal implements Herbivores, Carnivores{
    public void eat(){
        System.out.println("Herbivores eats grass");
    }
    public void walk(){
        System.out.println("Carnivores walk");
    }
}