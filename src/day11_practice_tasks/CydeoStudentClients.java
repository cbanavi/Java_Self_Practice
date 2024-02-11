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

/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.
 */