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


/*
1. Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */