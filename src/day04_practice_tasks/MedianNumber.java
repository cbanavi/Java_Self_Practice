package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if (b > a && b < c) {
            System.out.println(b + " is the median number");
        } else if (a > b && a < c) {
            System.out.println(a + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }

    }
}