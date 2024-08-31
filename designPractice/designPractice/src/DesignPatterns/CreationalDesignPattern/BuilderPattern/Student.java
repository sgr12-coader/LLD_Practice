package DesignPatterns.CreationalDesignPattern.BuilderPattern;

import java.util.List;

public class Student {
    int rollNo;
    String name;
    String address;
    String phoneNo;
    String email;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student (StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.address = studentBuilder.address;
        this.phoneNo = studentBuilder.phoneNo;
        this.email = studentBuilder.email;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public String toString() {
        return "Roll No: " + rollNo + "\nName: " + name + "\nAddress: " + address + "\nPhone No: " + phoneNo + "\nEmail: " + email + "\nFather's Name: " + fatherName + "\nMother's Name: " + motherName + "\nSubjects: " + subjects;
    }
}
