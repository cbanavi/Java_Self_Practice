package day13_practice_tasks.student_task;

public class CydeoStudent extends Student {

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getAge() + '\'' +
                '}';
    }

}

/*
3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */