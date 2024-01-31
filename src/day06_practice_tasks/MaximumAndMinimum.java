package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        System.out.println(maxInt(8, 5));
        System.out.println(maxDouble(8.0, 50.9));
        System.out.println(minInt(7, 9));
        System.out.println(minDouble(4.9,-8.4));
    }

    public static int maxInt(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } return num2;
    }

    public static double maxDouble(double num3, double num4) {
        if (num3 > num4) {
            return num3;
        } return num4;
    }

    public static int minInt(int num5, int num6) {
        if (num5 < num6) {
            return num5;
        } return num6;
    }

    public static double minDouble(double num7, double num8) {
        if (num7 < num8) {
            return num7;
        } return num8;
    }
}