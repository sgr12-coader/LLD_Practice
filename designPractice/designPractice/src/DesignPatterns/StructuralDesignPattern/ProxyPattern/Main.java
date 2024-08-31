package DesignPatterns.StructuralDesignPattern.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        ((EmployeeDaoProxy) employeeDao).setAdmin(false);
        employeeDao.addEmployee("John Doe");
        employeeDao.deleteEmployee("John Doe");
        employeeDao.updateEmployee("John Doe");
        employeeDao.getEmployee("John Doe");
    }
}
