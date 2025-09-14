package oopsConcept;
class Student{
        String name;
        int age;
        int roll;
        Student(){
            System.out.println("Aditya");
        }
        Student(String name){ // Parametrized constructor
            this.name = name;
        }
        Student(int roll){
            this.roll = roll;
        }
    }
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Harsh");
        Student s3 = new Student(123);
        System.out.println(s2.name);
        System.out.println(s3.roll);
        // System.out.println(s1.name);
    }
    
}

