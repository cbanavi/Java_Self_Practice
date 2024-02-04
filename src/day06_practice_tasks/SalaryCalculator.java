package day06_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        double income = salary(45, 40);
        System.out.println(income);

    }

    public static double salary(double hourlyRate, int weeklyHours) {
        return hourlyRate * weeklyHours * 52;
    }
}