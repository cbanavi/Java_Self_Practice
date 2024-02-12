package day11_practice_tasks;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent.schoolName = "Cydeo";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent student1 = new CydeoStudent("Chiyavan Banavi", 26, "A01", 'A' );
        CydeoStudent student2 = new CydeoStudent("John Doe", 30, "A02", 'B' );
        CydeoStudent student3 = new CydeoStudent("Jane Doe", 26, "A03", 'A' );
        
        System.out.println(student1);
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();

        System.out.println("--------------------------------");

        System.out.println(student2);
        student2.study();
        student2.attendClass();
        student2.printSchoolName();
        student2.printProgLanguage();

        System.out.println("--------------------------------");

        System.out.println(student3);
        student3.study();
        student3.attendClass();
        student3.printSchoolName();
        student3.printProgLanguage();
    }

}