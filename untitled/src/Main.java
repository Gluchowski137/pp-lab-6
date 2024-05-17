import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alice", 30000, 1, "2021-01-15", "Worker");
        Worker worker2 = new Worker("Bob", 32000, 2, "2021-02-10", "Worker");
        Worker worker3 = new Worker("Charlie", 34000, 1, "2021-03-05", "Worker");
        
        Manager manager = new Manager("Eve", 50000, 3, "2020-11-25", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);
        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }
        
        System.out.println("worker3 equals worker1: " + worker3.equals(worker1));
        System.out.println("worker3 equals worker2: " + worker3.equals(worker2));
        System.out.println("worker3 equals manager: " + worker3.equals(manager));
    }
}