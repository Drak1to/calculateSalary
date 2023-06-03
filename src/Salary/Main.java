package Salary;

public class Main {
    public static void main(String[] args) {
        Work work = new Work(25, 84);
        System.out.println(work.salary());
        Worker worker = new Worker();
        System.out.println(worker.salary());



    }
}
