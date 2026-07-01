public class Student {
    public static void main(String[] args) {
     student s1 = new student();
     student s2 = new student("Yalaguresh");
     student s3 = new student(251);   
    }

    
}

class student{
    String name;
    int roll;

    student(){
        System.out.println("Construcntor is calling. . . .");
    }

    student(String name){
        this.name = name;
    }

    student(int roll){
        this.roll = roll;
    }
}
