package day02_practice_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SET";
        double yearsOfExperience = 2.5;
        double salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Company name: " + companyName);
        System.out.println("Full time: " + isFullTime);
        System.out.println("Years of work experience: " + yearsOfExperience + " years");
        System.out.println("Salary: $" + salary);
        System.out.println("Married: " + isMarried);


    }
}
