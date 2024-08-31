package DesignPatterns.CreationalDesignPattern.BuilderPattern;

public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        else {
            return null;
        }
    }

    private Student createEngineeringStudent() {
        return studentBuilder
            .setRollNo(1).setSubjects()
            .setName("John Doe")
            .setAddress("123, Baker Street")
            .setPhoneNo("1234567890")
            .setEmail("abc@xyz.com").build();

    }

    private Student createMBAStudent() {
        return studentBuilder
            .setRollNo(2).setSubjects()
            .setName("Doe Jane")
            .setAddress("456, Baker Street")
            .setPhoneNo("1234567890")
            .setEmail("pqr@xyz.com").build();
    }
}
