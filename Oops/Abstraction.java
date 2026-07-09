public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // Dog d = new Dog();
        // h.eat();
        // h.walk();
        // d.eat();
        // d.walk();
        // System.out.println("Horse color " + h.color);
        C c1 = new C();
        

    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "Black";
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "Dark Black";
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}

class Dog extends Animal{
    void changeColor(){
        color = "Brown";
    }
    void walk(){
        System.out.println("Dog is walking");
    }
}

// COnstructor abstraction A->B->C

abstract class A{
    A(){
        System.out.println("Constructor A is called");
    }
}
class B extends A {
    B(){
        System.out.println("Constructor B is called");
    }
}
class C extends B{
    C(){
        System.out.println("Constructor C is called");
    }
}