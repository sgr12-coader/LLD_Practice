package DesignPatterns.CreationalDesignPattern.PrototypePattern;

public class Student implements Prototype{
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    @Override
    public Prototype clone() {
        return new Student(this.name, this.age, this.address);
    }
}
