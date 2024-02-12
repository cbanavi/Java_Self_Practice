package day11_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe", 32, 'M', "IT", 150_000);
        Employee employee2 = new Employee("Jane Doe", 45, 'f', "Admin", 100_000);
        Employee employee3 = new Employee("Chiyavan Banavi", 26, 'M', "Developer", 150_000);


        System.out.println(employee1);
        employee1.work();
        System.out.println(employee2);
        employee2.work();
        System.out.println(employee3);
        employee3.work();


    }

}