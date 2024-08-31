package DesignPatterns.StructuralDesignPattern.ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDaoImplementation employeeDaoImplementation = new EmployeeDaoImplementation();
    boolean isAdmin;
    @Override
    public void addEmployee(String name) {
        if (isAdmin) {
            System.out.println("Proxy Employee added");
            employeeDaoImplementation.addEmployee(name);
        } else {
            System.out.println("Only admin can add employee");
        }
    }

    @Override
    public void deleteEmployee(String name) {
        if (isAdmin) {
            System.out.println("Proxy Employee deleted");
            employeeDaoImplementation.deleteEmployee(name);
        } else {
            System.out.println("Only admin can delete employee");
        }
    }

    @Override
    public void updateEmployee(String name) {
        if (isAdmin) {
            System.out.println("Proxy Employee updated");
            employeeDaoImplementation.updateEmployee(name);
        } else {
            System.out.println("Only admin can update employee");
        }
    }

    @Override
    public void getEmployee(String name) {
        System.out.println("Proxy Employee fetched");
        employeeDaoImplementation.getEmployee(name);

    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
