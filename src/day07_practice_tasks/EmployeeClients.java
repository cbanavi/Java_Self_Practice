package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Chiyavan Banavi";
        employee1.age = 26;
        employee1.gender = 'M';
        employee1.jobTitle = "SDET";
        employee1.salary = 120_000;

        employee1.work();
        System.out.println(employee1);

        System.out.println();

        Employee employee2 = new Employee();

        employee2.name = "Jane Doe";
        employee2.age = 32;
        employee2.gender = 'F';
        employee2.jobTitle = "Developer";
        employee2.salary = 200_000;

        employee2.work();
        System.out.println(employee2);

        System.out.println();

        Employee employee3 = new Employee();

        employee3.name = "John Doe";
        employee3.age = 33;
        employee3.gender = 'M';
        employee3.jobTitle = "CEO";
        employee3.salary = 500_000;

        employee3.work();
        System.out.println(employee3);


    }

}