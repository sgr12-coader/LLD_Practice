package DesignPatterns.CreationalDesignPattern.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "123 Street");
        student1.display();
        Student clonedStudent = (Student) student1.clone();
        clonedStudent.display();
    }
}
