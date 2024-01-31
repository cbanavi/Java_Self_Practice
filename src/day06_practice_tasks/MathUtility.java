package day06_practice_tasks;


public class MathUtility {

    public static void main(String[] args) {
        int mathOperate = calculateResult(10, '+', 20);
        double mathOperate2 = calculateResult(2.5, '*', 3.0);
        int squareInt = square(8);
        double squareDouble = square(1.5);
        int cubeInt = cube(3);
        double cubeDouble = cube(2.5);

        System.out.println(mathOperate);
        System.out.println(mathOperate2);
        System.out.println(squareInt);
        System.out.println(squareDouble);
        System.out.println(cubeInt);
        System.out.println(cubeDouble);
}

    public static int calculateResult(int num1, char math, int num2){
        switch (math) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    public static double calculateResult(double num1, char math, double num2){
        switch (math) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    public static int square(int num1) {
        return num1 * num1;
    }

    public static double square(double num1) {
        return num1 * num1;
    }

    public static int cube(int num1) {
        return num1 * num1 * num1;
    }

    public static double cube(double num1) {
        return num1 * num1 * num1;
    }
}