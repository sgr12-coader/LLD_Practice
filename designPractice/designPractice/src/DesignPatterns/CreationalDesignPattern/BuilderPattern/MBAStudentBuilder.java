package DesignPatterns.CreationalDesignPattern.BuilderPattern;

import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = List.of("Marketing", "Finance", "Human Resource", "Operations");
        this.subjects = subjects;
        return this;
    }
}
