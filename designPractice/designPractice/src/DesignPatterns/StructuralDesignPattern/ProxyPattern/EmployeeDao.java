package DesignPatterns.StructuralDesignPattern.ProxyPattern;

public interface EmployeeDao {
    void addEmployee(String name);
    void deleteEmployee(String name);
    void updateEmployee(String name);
    void getEmployee(String name);
}
