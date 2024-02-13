package day13_practice_tasks.employee_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester1 = new Tester("John Doe", 27, "Male", "A01", "SDET", 160_000, "Google");
        System.out.println(tester1);
        tester1.work();

        Developer developer1 = new Developer("Jane Doe", 26, "Female", "A02", "Developer", 170_000, "Amazon", "Java");
        System.out.println(developer1);
        developer1.work();

        Teacher teacher1 = new Teacher("Derrick Gomez", 30, "Male", "A03", "Math Teacher", 100_000, "SDSU");
        System.out.println(teacher1);
        teacher1.work();

        Driver driver1 = new Driver("Jennifer Castro", 29, "Female", "A04", "Bus Driver", 120_000, "Yellow Bus Inc");
        System.out.println(driver1);
        driver1.work();
    }

}

/*
3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.
 */