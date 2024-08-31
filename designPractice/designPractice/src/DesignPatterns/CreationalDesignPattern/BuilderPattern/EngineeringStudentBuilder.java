package DesignPatterns.CreationalDesignPattern.BuilderPattern;

import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = List.of("Maths", "Physics", "Chemistry", "Computer Science");
        return this;
    }

}
