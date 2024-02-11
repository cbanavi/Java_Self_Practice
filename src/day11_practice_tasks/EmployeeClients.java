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

/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */