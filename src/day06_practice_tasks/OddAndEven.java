package day06_practice_tasks;

public class OddAndEven {

    public static void main(String[] args) {
        boolean resultOdd = isOdd(100);
        boolean resultEven = isEven(100);
        System.out.println(resultOdd);
        System.out.println(resultEven);
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}