package Strings;

public class LargString {
    public static void main(String[] args) {
        String Fruits[] = {"Apple","Banana","Mango","Orange"};

        String Largest = Fruits[0];
        for(int i=0 ; i<Fruits.length; i++){
            if (Largest.compareTo(Fruits[i]) < 0) {
                Largest = Fruits[i] ;
            }
        }
        System.out.println("Largest Fruit is :" + Largest);
    }
}
