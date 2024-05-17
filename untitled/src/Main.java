import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alice", 30000, 1, "2021-01-15", "Worker");
        Worker worker2 = new Worker("Bob", 32000, 2, "2021-02-10", "Worker");
        Worker worker3 = new Worker("Charlie", 34000, 3, "2021-03-05", "Worker");
        Worker worker4 = new Worker("Dave", 36000, 4, "2021-04-20", "Worker");
        
        Manager manager = new Manager("Eve", 50000, 5, "2020-11-25", "Manager");
        
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        
        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}