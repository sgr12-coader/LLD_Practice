package DesignPatterns.CreationalDesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director( new MBAStudentBuilder());
        Student student = director.createStudent();
        System.out.println(student);

        director = new Director( new EngineeringStudentBuilder());
        student = director.createStudent();
        System.out.println(student);
    }
}
