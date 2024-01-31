package day05_practice_tasks;

public class FINRA {
    public static void main(String[] args) {

        int n = 100;
        int number = 1;

        do {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FINRA ");
            } else if (number % 3 == 0) {
                System.out.print("FIN ");
            } else if (number % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(number + " ");
            }
            number++;

        } while (number <= n);
    }
}