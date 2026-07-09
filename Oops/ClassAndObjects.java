/**
 * ClassAndObjects
 */
public class ClassAndObjects {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Black");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
    
}

class pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setTip(int newtip){
        this.tip = newtip;
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }
}