package day13_practice_tasks.student_task;

public class StudentClients {

    public static void main(String[] args) {

        Student student1 = new Student("John Doe", 25, "Male");
        Student student2 = new Student("Jane Don", 27, "Female");

        GraduateStudent graduate1 = new GraduateStudent("Jack Evans", 28, "Male", "A01", "SDET", 'A', "Cydeo");
        GraduateStudent graduate2 = new GraduateStudent("Daisy Owens", 30, "Female","A02", "Developer", 'C', "Cydeo");

        UndergraduateStudent undergrad1 = new UndergraduateStudent("Mike Stevens", 22, "Male", "A03", "IT", 'B', "Cydeo");
        UndergraduateStudent undergrad2 = new UndergraduateStudent("Jen Lee", 22, "Female", "A04", "Cybersecurity", 'B', "Cydeo");

        CydeoStudent cydeo1 = new CydeoStudent("Daniel Garcia", 29, "Male", "A04", "Programming",
                'B',"Cydeo",1, 2, "Java");
        CydeoStudent cydeo2 = new CydeoStudent("Daniella Lopez", 29, "Female", "A05", "AI",
                'C', "Cydeo", 2, 3, "C++");

        System.out.println("Student's:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("Graduate's:");
        System.out.println(graduate1);
        System.out.println(graduate2);
        System.out.println("Undergraduate's:");
        System.out.println(undergrad1);
        System.out.println(undergrad2);
        System.out.println("Cydeo Student's");
        System.out.println(cydeo1);
        System.out.println(cydeo2);

    }

}

/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */
