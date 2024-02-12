package day11_practice_tasks;

public class CydeoStudent {

    public String name;
    public int age;
    public String id;
    public char grade;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, String id, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;

    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " is attending the live class");
    }

    public void printSchoolName() {
        System.out.println(schoolName);
    }

    public void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                '}';
    }
}