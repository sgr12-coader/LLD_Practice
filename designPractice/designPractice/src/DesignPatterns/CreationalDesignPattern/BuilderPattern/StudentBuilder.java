package DesignPatterns.CreationalDesignPattern.BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String name;
    String address;
    String phoneNo;
    String email;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    abstract public StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
