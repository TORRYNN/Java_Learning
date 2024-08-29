public class ConstructorsInJava {

    
    public static void main(String[] args) {
        Student obj=new Student(); 

    }
}

class Student{
    String name;
    int roll;
    Student(){
        System.out.println("This is constructor.");
    }
}