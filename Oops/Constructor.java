public class Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1(); // objects
        Student2 s2 = new Student2("Yalaguresh", 251);
        System.out.println(s2.name + " " + s2.rollNo);
        Student2 s3 = new Student2("Anu", 251);
        System.out.println(s3.name + " " + s3.rollNo);

    }
}
class Student1{
    String name;
    int rollNo;
    // non-parameterized constructor
    Student1(){
        System.out.println("Default Constructor is calling . . . .");
    }
}

class Student2{
    String name;
    int rollNo;
    // parameterized constructor
    Student2(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Student3{
    String name;
    int rollNo;
    // Copy - Constructor
    Student3(Student2 s){
        this.name = s.name;
        this.rollNo = s.rollNo;
    }
}