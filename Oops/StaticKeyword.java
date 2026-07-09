public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "NMIT";
        
        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        Student s3 = new Student();
        s3.SchoolName = "RVCS";
        
    }
}

class Student{
    String name;
    int rollNo;
    static String SchoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
