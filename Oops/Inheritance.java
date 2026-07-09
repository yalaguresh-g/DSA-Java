public class Inheritance {
    public static void main(String[] args) {
        // Sheep s1 = new Sheep();
        // s1.fly();
        // Deer d1 = new Deer();
        // d1.eat();
        Lion l1 = new Lion();
        l1.roar();
        Tiger t1 = new Tiger();
        t1.eat();
    }
}

// Base class
class Animal{
    String name;
    String color;
    int age;
    void eat(){
        System.out.println("Animal is Eating");
    }
    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
// Derivvd class
class Sheep extends Animal{
    int legs;
    void fly(){
        System.out.println("Sheep is Flying");
    }
    void sleep(){
        System.out.println("Sheep is Sleeping");
    }
}
// A -> B -> c This is multilevel inheritance
class Deer extends Sheep{
    void run(){
        System.out.println("Deer is Sleeping");
    }
}

// Hierarchical Inheritance
class Lion extends Animal{
    void roar(){
        System.out.println("Lion is Roaring");
    }
}

class Tiger extends Animal{
    void roar(){
        System.out.println("Tiger is Roaring");
    }
}