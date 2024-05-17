import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Alice", 30000, 1, "2021-01-15", "Worker");
        Worker worker2 = new Worker("Bob", 32000, 1, "2021-02-10", "Worker");
        Worker worker3 = new Worker("Charlie", 34000, 3, "2021-03-05", "Worker");
        Worker worker4 = new Worker("Dave", 36000, 1, "2021-04-20", "Worker");

        Manager manager1 = new Manager("Eve", 50000, 4, "2020-11-25", "Manager");
        Manager manager2 = new Manager("Frank", 55000, 5, "2019-10-30", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);
        employees.add(manager2);
        
        System.out.println("Employee list:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (ID: " + employee.hashCode() + ")");
        }
        
        findAndDisplayDuplicatesById(employees);
    }

    public static void findAndDisplayDuplicatesById(List<Employee> employees) {
        Set<Employee> visited = new HashSet<>();
        System.out.println("\nEmployees with the same ID:");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee1 = employees.get(i);
            if (!visited.contains(employee1)) {
                List<Employee> duplicates = new ArrayList<>();
                for (int j = 0; j < employees.size(); j++) {
                    Employee employee2 = employees.get(j);
                    if (employee1.equals(employee2) && employee1 != employee2) {
                        duplicates.add(employee2);
                    }
                }
                if (!duplicates.isEmpty()) {
                    duplicates.add(employee1);
                    visited.addAll(duplicates);
                    System.out.println("ID: " + employee1.hashCode());
                    for (Employee duplicate : duplicates) {
                        System.out.println("- " + duplicate.getName() + " (Position: " + duplicate.getPosition() + ")");
                    }
                }
            }
        }
    }
}