import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alice", 30000, 1);
        Worker worker2 = new Worker("Bob", 32000, 2);
        Worker worker3 = new Worker("Charlie", 34000, 3);
        Worker worker4 = new Worker("Dave", 36000, 4);
        
        Manager manager = new Manager("Eve", 50000, 5);
        
        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println("Worker Salary: " + worker.getSalary());
            worker.work();
        }
        
        System.out.println("Manager Salary: " + manager.getSalary());
        manager.work();
    }
}