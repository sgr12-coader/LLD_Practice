package DesignPatterns.StructuralDesignPattern.ProxyPattern;

public class EmployeeDaoImplementation implements EmployeeDao{
    @Override
    public void addEmployee(String name) {
        System.out.println("Employee added: " + name);
    }

    @Override
    public void deleteEmployee(String name) {
        System.out.println("Employee deleted: " + name);
    }

    @Override
    public void updateEmployee(String name) {
        System.out.println("Employee updated: " + name);
    }

    @Override
    public void getEmployee(String name) {
        System.out.println("Employee fetched: " + name);
    }
}
