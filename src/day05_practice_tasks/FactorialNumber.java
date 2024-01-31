package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num1 = 5;
        int factorial = 1;

        for (int i = num1; i >= 1; i--) {
            factorial *= i;
        }
        System.out.print(factorial + " ");
    }
}