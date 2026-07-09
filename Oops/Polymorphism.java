public class Polymorphism {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.sum(5, 5));
        // System.out.println(c.sum(4.5, 6.3));
        // System.out.println(c.sum(10, 20, 30));

        Deer d = new Deer();
        d.eat();
    }
}
// method overloading
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    double sum(double a, double b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

// Method overiding

class Animal{
    void eat(){
        System.out.println("Animals eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats Grass");
    }
}